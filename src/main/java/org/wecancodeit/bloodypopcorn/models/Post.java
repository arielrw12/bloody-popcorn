package org.wecancodeit.bloodypopcorn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Lob
	private String body;
	private String postDate;
	@ManyToMany
	private Collection<Author> authors;
	
	@ManyToOne
	private Genre genre;
	
	@ManyToMany
	private Collection<Tag> tags;
	
	public Post() {
		
	}
	
	public Post(String title, String body, String postDate, Genre genre, Tag tag, Author ...authors) {
		this.title = title;
		this.body = body;
		this.postDate = postDate;
		this.genre = genre;
		this.tags = Arrays.asList(tag); 
		this.authors = Arrays.asList(authors);
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

	public String getPostDate() {
		return postDate;
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
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", postDate=" + postDate + ", tag=" + tags
				+ ", authors=" + authors + ", genre=" + genre + "]";
	}

	


}
