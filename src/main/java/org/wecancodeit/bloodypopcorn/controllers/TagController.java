package org.wecancodeit.bloodypopcorn.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.bloodypopcorn.models.Tag;
import org.wecancodeit.bloodypopcorn.repositories.AuthorRepository;
import org.wecancodeit.bloodypopcorn.repositories.GenreRepository;
import org.wecancodeit.bloodypopcorn.repositories.PostRepository;
import org.wecancodeit.bloodypopcorn.repositories.TagRepository;

@Controller
public class TagController {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/tags/allTags")
	public String getTagList(Model model) {
		model.addAttribute("tag", tagRepo.findAll());
		return "tags/allTags";
	}
	
	@PostMapping("/tags/allTags")
	public String addTag(String tagName) {
		Tag tag1 = tagRepo.findByTagName(tagName);
		if (tag1 == null) {
			tag1 = tagRepo.save(new Tag(tagName));
		}
		return "redirect:/tags/allTags";
	}
	
	@GetMapping("/tags/{tagId}")
	public String getTagById(@PathVariable Long tagId, Model model) {
		model.addAttribute("tag", tagRepo.findById(tagId).get());
		return "tags/individualTag";
	}
	
}
