package org.wecancodeit.bloodypopcorn.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	private String authorName;
	@ManyToOne
	private Collection<Post> posts;
	
	public Author(String authorName) {
		this.authorName = authorName;
		this.posts = new ArrayList<>();
	}
	
	public Author() {
		
	}

}

