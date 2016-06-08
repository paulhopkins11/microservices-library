package uk.co.frameworktraining.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	private @Id @GeneratedValue Long id;
	private String title, isbn, description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public Book(String title, String isbn, String description) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.description = description;
	}

	private Book() {
	}

}
