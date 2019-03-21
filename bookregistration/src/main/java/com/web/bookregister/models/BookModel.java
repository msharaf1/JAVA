package com.web.bookregister.models;

import javax.validation.Valid;

public class BookModel {
	
	private String bookName;
	private String bookAuthor;
	private String published;
	
	public BookModel() {}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}



	
	
}
