package uk.co.frameworktraining.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import uk.co.frameworktraining.model.Inventory;
import uk.co.frameworktraining.model.LibraryBook;

@RestController
@RequestMapping("/library")
public class LibraryRestController {

	private static String BOOK_SERVICE_URL = "http://book-service:8080/";

	static {
		String url = System.getenv("BOOK_SERVICE_URL");
		if (url != null && url.length() > 0) {
			BOOK_SERVICE_URL = url;
		}
	}

	Logger logger = LoggerFactory.getLogger(LibraryRestController.class.getName());

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	Inventory getBooks() {
		String url = BOOK_SERVICE_URL + "books";
		logger.info(">>> get library. " + url);
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<LibraryBook>> rateResponse = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<LibraryBook>>() {
				});
		List<LibraryBook> books = rateResponse.getBody();

		return new Inventory(new Date(), books);
	}
}
