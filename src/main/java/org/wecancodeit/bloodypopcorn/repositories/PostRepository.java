package org.wecancodeit.bloodypopcorn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bloodypopcorn.models.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	Post findByTitle(String string);
	
	Post getPostById(Long postId);

}
