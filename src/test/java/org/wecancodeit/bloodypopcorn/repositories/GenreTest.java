package org.wecancodeit.bloodypopcorn.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.bloodypopcorn.models.Genre;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class GenreTest {
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private GenreRepository genreRepo;

	@Test
	public void shouldSaveAndLoadGenre() {
	    Genre genre = genreRepo.save(new Genre("test"));
	 
	    entityManager.persist(genre);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Genre genreFromDatabase = genreRepo.findByGenreName("test");
	 
	    assertThat(genreFromDatabase.getGenreName(), is("test"));
	}
}
