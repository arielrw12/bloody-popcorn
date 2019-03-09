package org.wecancodeit.bloodypopcorn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bloodypopcorn.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByTagName(String tagName);

	Object findAllById(Long tagId);


}
