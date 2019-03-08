package org.wecancodeit.bloodypopcorn.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue
	private Long id;
	private String genreName;
	@OneToMany(mappedBy="genre")
	private Collection<Post> posts;
	
	public Genre(String genreName) {
		this.genreName = genreName;
		this.posts = new ArrayList<>();
	}
	
	public Genre() {
		
	}

	public Long getId() {
		return id;
	}

	public String getGenreName() {
		return genreName;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", genreName=" + genreName + "]";
	}
}