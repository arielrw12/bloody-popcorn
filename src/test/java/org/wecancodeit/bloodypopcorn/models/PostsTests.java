package org.wecancodeit.bloodypopcorn.models;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

public class PostsTests {
	
	@Test
	public void shouldGetStringDate() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(LocalDateTime.now());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String formattedStringDate = currentDateTime.format(formatter);
		System.out.println(formattedStringDate);
		assertEquals("03-10-2019 12:49", formattedStringDate);
	}

}
