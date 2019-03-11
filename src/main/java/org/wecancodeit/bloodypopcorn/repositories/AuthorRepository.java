package org.wecancodeit.bloodypopcorn.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bloodypopcorn.models.Author;
import org.wecancodeit.bloodypopcorn.models.Tag;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

	Author findByAuthorName(String authorName);

	Optional<Author> findById(Long authorId);

}
