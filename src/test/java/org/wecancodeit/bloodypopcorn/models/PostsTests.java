package org.wecancodeit.bloodypopcorn.models;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

public class PostsTests {
	
//	@Test
//	//works when you put the current date/time in the assertEquals
//	public void shouldGetStringDate() {
//		LocalDateTime currentDateTime = LocalDateTime.now();
//		System.out.println(LocalDateTime.now());
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
//		String formattedStringDate = currentDateTime.format(formatter);
//		System.out.println(formattedStringDate);
//		assertEquals("03-10-2019 21:00", formattedStringDate);
//	}
	
	@Test
	public void shouldReturn1Tag() {
		Genre genre1 = new Genre("Slasher");
		Author author1 = new Author("Jane");
		Tag tag1 = new Tag("gory");
		Tag tag2 = new Tag("cheap");
		Post post1 = new Post("Movie", "Bodybodybody", genre1, tag1, author1);
//		System.out.println(post1.getTag());
		post1.addTagToTags(tag2);
		System.out.println(post1.getTags().contains(tag2));
		assertEquals(post1.getTag().contains(tag2), true);
	}

}
