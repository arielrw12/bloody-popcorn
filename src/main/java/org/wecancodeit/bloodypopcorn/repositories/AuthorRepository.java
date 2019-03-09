package org.wecancodeit.bloodypopcorn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bloodypopcorn.models.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

	Author findByAuthorName(String authorName);

}
