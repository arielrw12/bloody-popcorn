package org.wecancodeit.bloodypopcorn.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bloodypopcorn.models.Genre;
import org.wecancodeit.bloodypopcorn.models.Tag;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {

	Genre findByGenreName(String genreName);

	Optional<Genre> findById(Long genreId);

}
