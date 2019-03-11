package org.wecancodeit.bloodypopcorn.controllers;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.repositories.GenreRepository;

public class GenreControllerTest {
	 
    @InjectMocks
    private GenreController underTest;
 
    @Mock
    private GenreRepository genreRepo;
 
    @Mock
    private Genre genre;
    
	@Mock
	private Model model;
 
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldAddGenreToModel() throws Exception {
        Long genreId = 1L;
        when(genreRepo.findById(genreId)).thenReturn(Optional.of(genre));
 
        underTest.getGenreById(genreId, model);
 
        verify(model).addAttribute("genre", genre);
    }
}