package org.wecancodeit.bloodypopcorn.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.models.Tag;
import org.wecancodeit.bloodypopcorn.repositories.AuthorRepository;
import org.wecancodeit.bloodypopcorn.repositories.GenreRepository;
import org.wecancodeit.bloodypopcorn.repositories.PostRepository;
import org.wecancodeit.bloodypopcorn.repositories.TagRepository;

@Controller
public class GenreController {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/genre/allGenres")
	public String getGenreList(Model model) {
		model.addAttribute("genre", genreRepo.findAll());
		return "genre/allGenres";
	}
	
	@PostMapping("/genre/allGenres")
	public String addGenre(String genreName) {
		Genre genre1 = genreRepo.findByGenreName(genreName);
		if (genre1 == null) {
			genre1 = genreRepo.save(new Genre(genreName));
		}
		return "redirect:/genre/allGenres";
	}
}
