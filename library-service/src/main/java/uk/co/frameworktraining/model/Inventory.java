package uk.co.frameworktraining.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inventory {

	private Date requestDate;
	private Iterable<LibraryBook> books;

	public Inventory(Date requestDate, Iterable<LibraryBook> books) {
		super();
		this.requestDate = requestDate;
		this.books = books;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public Iterable<LibraryBook> getBooks() {
		return books;
	}

}
