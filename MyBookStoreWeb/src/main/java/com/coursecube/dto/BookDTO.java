package com.coursecube.dto;

import java.io.Serializable;

public class BookDTO implements Serializable{
	
	private static final long serialVersionUID = 1195935591742978556L;
	private Integer bookId;
	private String bookName;
	private String author;
	private String publications;
	private String category;
	
	public BookDTO() {
		super();
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
