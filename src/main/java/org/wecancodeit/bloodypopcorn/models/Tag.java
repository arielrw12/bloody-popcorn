package org.wecancodeit.bloodypopcorn.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String tagName;
	
	@ManyToMany(mappedBy="tags")
	private Collection<Post> posts;
	
	public Tag(String tagName) {
		this.tagName = tagName;
	}
	
	public Tag() {
		
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Be warned... This movie is tagged as: " + tagName;
	}
	
}