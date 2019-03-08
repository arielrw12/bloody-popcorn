package org.wecancodeit.bloodypopcorn;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.bloodypopcorn.models.Author;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.models.Post;
import org.wecancodeit.bloodypopcorn.models.Tag;
import org.wecancodeit.bloodypopcorn.repositories.AuthorRepository;
import org.wecancodeit.bloodypopcorn.repositories.GenreRepository;
import org.wecancodeit.bloodypopcorn.repositories.PostRepository;
import org.wecancodeit.bloodypopcorn.repositories.TagRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;

	@Override
	public void run(String... args) throws Exception {
	
		Author author1 = authorRepo.save(new Author("Joe"));
		
		Genre genre1 = genreRepo.save(new Genre("Slasher"));
		
		Post post1 = postRepo.save(new Post("Awesome movie", "The movie was so cool. It was great. V scary.", "May 8th", genre1, author1));
		
		tagRepo.save(new Tag("gory", post1));
		
	}
	
	

}
