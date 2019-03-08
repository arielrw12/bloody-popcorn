package org.wecancodeit.bloodypopcorn.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;
	private String authorName;
	@ManyToMany(mappedBy="posts")
	private Collection<Post> posts;
	
	public Author(String authorName) {
		this.authorName = authorName;
		this.posts = new ArrayList<>(); 
	}
	
	public Author() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + "]";
	}

	
}

