package org.wecancodeit.bloodypopcorn.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
//	@GetMapping("")
//	public String getPostsByAuthor(@PathVariable Long id, Model model) {
//		model.addAttribute(attributeName, attributeValue)
//	}
	
}
