package org.wecancodeit.bloodypopcorn.models;

import java.time.LocalDateTime;
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
		this.genre = genre;
		this.tags = Arrays.asList(tag); 
		this.authors = Arrays.asList(authors);
	}

	// BELOW WILL PROBABLY NEED REMOVED......................
	public Post(String title2, String body2) {
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getDate() {
		return date;
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

//	public Collection<Tag> getTags() {
//		return tags;
//	}
	
	public Collection<Tag> getTag() {
		return tags;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", date=" + date + ", authors=" + authors
				+ ", genre=" + genre + ", tags=" + tags + "]";
	}


	


}
