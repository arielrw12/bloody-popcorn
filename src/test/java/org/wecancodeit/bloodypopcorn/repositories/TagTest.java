package org.wecancodeit.bloodypopcorn.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.bloodypopcorn.models.Tag;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class TagTest {
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private TagRepository tagRepo;

	@Test
	public void shouldSaveAndLoadTag() {
	    Tag tag = tagRepo.save(new Tag("test"));
	 
	    entityManager.persist(tag);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Tag tagFromDatabase = tagRepo.findByTagName("test");
	 
	    assertThat(tagFromDatabase.getTagName(), is("test"));
	}
}
