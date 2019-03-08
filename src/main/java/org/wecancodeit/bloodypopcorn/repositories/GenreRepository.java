package org.wecancodeit.bloodypopcorn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bloodypopcorn.models.Genre;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {

}
