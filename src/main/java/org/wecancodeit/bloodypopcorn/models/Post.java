package org.wecancodeit.bloodypopcorn.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Lob
	private String body;
	private LocalDateTime date;
	private String formattedStringDate;
	@ManyToMany
	private Collection<Author> authors;
	
	@ManyToOne
	private Genre genre;
	
	@ManyToMany
	private Collection<Tag> tags;
	
	public Post() {
		
	}
	
	public Post(String title, String body, Genre genre, Tag tag, Author ...authors) {
		this.title = title;
		this.body = body;
		this.date = LocalDateTime.now();
		this.formattedStringDate = formattedStringDate;
		this.genre = genre;
		this.tags = Arrays.asList(tag); 
		this.authors = Arrays.asList(authors);
	}

	public LocalDateTime getDate() {
		return date;
	}
	
	public String getFormattedStringDate() {
		LocalDateTime postDateTime = date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String formattedStringDate = postDateTime.format(formatter);
		return formattedStringDate;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public Collection<Author> getAuthors() {
		return authors;
	}

	public Genre getGenre() {
		return genre;
	}
	
	public Collection<Tag> getTag() {
		return tags;
	}
	
	public void addTagToTags(Tag tag) {
		tags.add(tag);
	}
	
	public void addAuthorToAuthors(Author author) {
		authors.add(author);
		
	}

	@Override
	public String toString() {
		return "Post title: " + title + ", body=" + body + ", date=" + formattedStringDate + ", authors=" + authors
				+ ", genre=" + genre + ", tags=" + tags;
	}



	


}
