package org.wecancodeit.bloodypopcorn.controllers;

import java.time.LocalDateTime;

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
		model.addAttribute("genre", genreRepo.findAll());
		model.addAttribute("tag", tagRepo.findAll());
		model.addAttribute("author", authorRepo.findAll());
		return "post/allPosts";
	}
	
	@PostMapping("/post/allPosts")
	public String addPost(String title, String body, Long genreId, Long tagId, Long authorId) {
		Genre genre = genreRepo.findById(genreId).get();
		Tag tag = tagRepo.findById(tagId).get();
		Author author = authorRepo.findById(authorId).get();
		postRepo.save(new Post(title, body, genre, tag, author));
		return "redirect:/post/allPosts";	
	}
	
	@GetMapping("/post/{postId}")
	public String getPostById(@PathVariable Long postId, Model model) {
		model.addAttribute("post", postRepo.findById(postId).get());
		return "post/individualPost";
	}
			
			
}
