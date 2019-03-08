package org.wecancodeit.bloodypopcorn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
	
	public Post(String title, String body, String postDate, Genre genre, Tag ...tags) {
		this.title = title;
		this.body = body;
		this.postDate = postDate;
		this.authors = new ArrayList<>(); //?
		this.genre = genre;
		this.tags = Arrays.asList(tags); //?
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public Collection<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Collection<Author> authors) {
		this.authors = authors;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	public void setTags(Collection<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", postDate=" + postDate + ", authors="
				+ authors + ", genre=" + genre + ", tags=" + tags + "]";
	}

}
