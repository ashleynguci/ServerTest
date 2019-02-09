package fi.haagahelia.bookStore_.domain;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

	
}
