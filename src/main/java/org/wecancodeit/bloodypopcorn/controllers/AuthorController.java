package org.wecancodeit.bloodypopcorn.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.bloodypopcorn.models.Author;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.repositories.AuthorRepository;
import org.wecancodeit.bloodypopcorn.repositories.GenreRepository;
import org.wecancodeit.bloodypopcorn.repositories.PostRepository;
import org.wecancodeit.bloodypopcorn.repositories.TagRepository;

@Controller
public class AuthorController {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/author/allAuthors")
	public String getAuthorList(Model model) {
		model.addAttribute("author", authorRepo.findAll());
		return "author/allAuthors";
	}
	
	@PostMapping("/author/allAuthors")
	public String addAuthor(String authorName) {
		Author author1 = authorRepo.findByAuthorName(authorName);
		if (author1 == null) {
			author1 = authorRepo.save(new Author(authorName));
		}
		return "redirect:/author/allAuthors";
	}
	
	@GetMapping("/author/{authorId}")
	public String getAuthorById(@PathVariable Long authorId, Model model) {
		model.addAttribute("author", authorRepo.findById(authorId).get());
		return "/author/individualAuthor";
	}
	
}
