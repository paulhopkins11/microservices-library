package uk.co.frameworktraining.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.co.frameworktraining.model.Book;
import uk.co.frameworktraining.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookRestController {
	Logger logger = LoggerFactory.getLogger(BookRestController.class.getName());
	@Autowired
	private BookRepository bookRepository;

	@RequestMapping(method = RequestMethod.GET)
	Iterable<Book> getBooks() {
		logger.info(">>> getBooks");
		return this.bookRepository.findAll();
	}
}
