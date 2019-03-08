package org.wecancodeit.bloodypopcorn.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
//	@GetMapping("")
//	public String getTagList(Model model) {
//		model.addAttribute("tag", tagRepo.findAll());
//		return "";
//	}
	
//	@GetMapping("")
//	public String getPostsByAuthor(@PathVariable Long id, Model model) {
//		model.addAttribute(attributeName, attributeValue)
//	}
	
}
