package org.wecancodeit.bloodypopcorn.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.bloodypopcorn.models.Author;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.models.Post;
import org.wecancodeit.bloodypopcorn.models.Tag;
import org.wecancodeit.bloodypopcorn.repositories.AuthorRepository;
import org.wecancodeit.bloodypopcorn.repositories.GenreRepository;
import org.wecancodeit.bloodypopcorn.repositories.PostRepository;
import org.wecancodeit.bloodypopcorn.repositories.TagRepository;

@Controller
public class PostController {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/post/allPosts")
	public String getPostList(Model model) {
		model.addAttribute("post", postRepo.findAll());
		return "post/allPosts";
	}
	
	@PostMapping("/post/allPosts")
	public String addPost(
		@PathVariable Long id,
		// ("post")
		// may need to add above post line, trying to use it to fix
		// Missing URI template variable 'post' for method parameter of type Long error
		String title,
		String body,
		// is date needed here? Look into..................................
		Genre genre,
		Tag tag,
		Author author
		) {
		Tag tag1 = tagRepo.findById(id).get();
		Author author1 = authorRepo.findById(id).get();
		postRepo.save(new Post(title, body, genre, tag1, author1));
		return "redirect:/post/allPosts"; 
	}
	
	@GetMapping("/post/{postId}")
	public String getPostById(@PathVariable Long postId, Model model) {
		model.addAttribute("post", postRepo.findById(postId).get());
		return "post/individualPost";
	}
			
			
}
