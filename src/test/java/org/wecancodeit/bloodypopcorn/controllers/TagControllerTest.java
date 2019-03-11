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
import org.wecancodeit.bloodypopcorn.models.Tag;
import org.wecancodeit.bloodypopcorn.repositories.TagRepository;

public class TagControllerTest {
	 
    @InjectMocks
    private TagController underTest;
 
    @Mock
    private TagRepository tagRepo;
 
    @Mock
    private Tag tag;
    
	@Mock
	private Model model;
 
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldAddTagToModel() throws Exception {
        Long tagId = 1L;
        when(tagRepo.findById(tagId)).thenReturn(Optional.of(tag));
 
        underTest.getTagById(tagId, model);
 
        verify(model).addAttribute("tag", tag);
    }
}