package uk.co.frameworktraining.repository;

import org.springframework.data.repository.CrudRepository;

import uk.co.frameworktraining.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	Book findByTitle(String name);

	Book findByIsbn(String isbn);
}
