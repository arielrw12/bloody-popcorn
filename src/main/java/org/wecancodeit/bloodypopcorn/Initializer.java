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
public class Initializer<Body> implements CommandLineRunner {

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
	
		Author author1 = authorRepo.save(new Author("Ginger Vitas"));
		Author author2 = authorRepo.save(new Author("Myra Gret"));
		Author author3 = authorRepo.save(new Author("Perry Noid"));
		Author author4 = authorRepo.save(new Author("Upton O'Goode"));
		Author author5 = authorRepo.save(new Author("Yule B. Sorree"));
		
		Genre genre1 = genreRepo.save(new Genre("Slasher"));
		Genre genre2 = genreRepo.save(new Genre("Sci-Fi"));
		Genre genre3 = genreRepo.save(new Genre("Psychological"));
		Genre genre4 = genreRepo.save(new Genre("Hauntings"));
		Genre genre5 = genreRepo.save(new Genre("Comedy Horror"));
		Genre genre6 = genreRepo.save(new Genre("Apocalyptic"));
		Genre genre7 = genreRepo.save(new Genre("Classics"));
		
		Tag tag1 = tagRepo.save(new Tag("gory"));
		Tag tag2 = tagRepo.save(new Tag("cheap"));
		Tag tag3 = tagRepo.save(new Tag("funny"));
		Tag tag4 = tagRepo.save(new Tag("cliche"));
		Tag tag5 = tagRepo.save(new Tag("gross"));
		Tag tag6 = tagRepo.save(new Tag("jump-worthy"));
		Tag tag7 = tagRepo.save(new Tag("terrifying"));
		Tag tag8 = tagRepo.save(new Tag("wacky"));
		Tag tag9 = tagRepo.save(new Tag("surprising"));
		Tag tag10 = tagRepo.save(new Tag("bloody"));
		Tag tag11 = tagRepo.save(new Tag("suspensful"));
		Tag tag12 = tagRepo.save(new Tag("slow"));
		Tag tag13 = tagRepo.save(new Tag("dull"));
		Tag tag14 = tagRepo.save(new Tag("amazing"));
		Tag tag15 = tagRepo.save(new Tag("great"));
		Tag tag16 = tagRepo.save(new Tag("terrible"));
		Tag tag17 = tagRepo.save(new Tag("disappointing"));
		Tag tag18 = tagRepo.save(new Tag("based on true story"));
		Tag tag19 = tagRepo.save(new Tag("disturbing"));
		Tag tag20 = tagRepo.save(new Tag("gripping"));
		
		String loremIpsum = "Lorem ipsum dolor sit amet, cum no insolens conceptam, at noluisse dissentiunt cum! Atomorum persecuti pri te, vix at graecis intellegebat, ne eam dolor primis posidonium. His nonumy soleat in, cum ex omnis reque petentium. In cibo principes nec, vix solet placerat eleifend an. Ne dicam populo vix, sale laoreet suscipiantur in est.\r\n" + 
				"\r\n" + 
				"An option mentitum voluptaria eam, nam ei admodum maluisset, quo option noluisse mediocrem eu. Te vel admodum menandri. His no doctus deterruisset? Ne magna dissentiunt ius, eam lobortis intellegebat ex!\r\n" + 
				"\r\n" + 
				"Te illud graece reprehendunt sit, insolens reprehendunt ne per, no has quod adhuc nostrum. Eos no mandamus dignissim? Ludus definitionem sed cu, vel libris iuvaret cotidieque ei, veri deseruisse ea ius? Pro ei aliquid referrentur, sed no essent ceteros temporibus? Ei graecis quaestio nec, malorum feugait partiendo te has! Nostrum pertinacia dissentiet cum id. No tibique praesent his, latine impetus appetere eu sea, iisque euismod nusquam cu has.\r\n" + 
				"\r\n" + 
				"His cu nostrud deterruisset? Ei eam minim maiestatis, cu per erant principes. Facete appetere senserit ex sit. Et dicta tritani scaevola has, verear ornatus ei mea. Quot delectus eam cu, sit ex enim signiferumque.\r\n" + 
				"\r\n" + 
				"Eu tamquam probatus quo, ei pri everti menandri splendide? Has cu ferri putant molestiae, dictas periculis ocurreret eam ut. Vero reque torquatos et duo, mutat alterum urbanitas at mea? Cum ne reque quando.\r\n" + 
				"\r\n" + 
				"Ignota accommodare mea cu, cu mel tacimates aliquando dissentias, per an probo inani probatus? Legere gubergren an mea, his eu sint singulis pericula. Sea utamur diceret ex, antiopam gloriatur mei ad. Usu euismod denique et? His sint expetenda intellegat cu. Pri in quis vivendum maiestatis.\r\n" + 
				"\r\n" + 
				"Meliore persequeris necessitatibus ei quo. Duo ne labitur aliquam albucius, sit officiis dissentiunt at, eam in augue dolore liberavisse? At mei vide dolor petentium, accusata sensibus ne cum! In sit enim putent mentitum, choro aperiam bonorum sed an. Illum aperiri lobortis eu mea, zril veniam vim ea, cum assueverit cotidieque ad?";
		Post post1 = postRepo.save(new Post("Awesome movie", loremIpsum, genre1, tag1, author1, author2));
		Post post2 = postRepo.save(new Post("Terrible Movie", loremIpsum, genre2, tag2, author1, author4));
		Post post3 = postRepo.save(new Post("What a plot twist", loremIpsum, genre3, tag3, author3, author5, author2));
		Post post4 = postRepo.save(new Post("Worst ever", loremIpsum, genre4, tag4, author4, author3));
		Post post5 = postRepo.save(new Post("Don't turn the lights out", loremIpsum, genre5, tag5, author5));
		Post post6 = postRepo.save(new Post("Distubing and hilarious", loremIpsum, genre6, tag6,   author1));
		Post post7 = postRepo.save(new Post("Super slow. Super", loremIpsum, genre7, tag7,  author2));
		Post post8 = postRepo.save(new Post("The original was better", loremIpsum, genre1, tag8,  author3));
		Post post9 = postRepo.save(new Post("Way better than the original", loremIpsum, genre2, tag9, author4));
		Post post10 = postRepo.save(new Post("Didn't live up to the hype", loremIpsum, genre3, tag10, author5));
		Post post11 = postRepo.save(new Post("I hid behind my pillow for half the movie", loremIpsum, genre4, tag11, author1));
		Post post12 = postRepo.save(new Post("Unimaginative and cliche", loremIpsum, genre5, tag12, author2));
		
		

	}
	
	

}
