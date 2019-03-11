package org.wecancodeit.bloodypopcorn.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.bloodypopcorn.models.Author;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.models.Post;
import org.wecancodeit.bloodypopcorn.models.Tag;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class PostTest {
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private PostRepository postRepo;
	
	@Resource
	private AuthorRepository authorRepo;
	
	@Resource
	private TagRepository tagRepo;
	
	@Resource
	private GenreRepository genreRepo;

	@Test
	public void shouldSaveAndLoadPost() {
		Author author1 = new Author("Max");
		authorRepo.save(author1);
		Tag tag1 = new Tag("low-budget");
		tagRepo.save(tag1);
		Genre genre1 = new Genre("Zombies");
		genreRepo.save(genre1);
	    Post post = postRepo.save(new Post("test", "testtest", genre1, tag1, author1));
	 
	    entityManager.persist(post);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Post postFromDatabase = postRepo.findByTitle("test");
	 
	    assertThat(postFromDatabase.getTitle(), is("test"));
	}
}