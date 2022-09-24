package com.blz;

/**
 * 
 * @author kastu
 *
 */
public class Books {
	/*
	 * Defining bookName , bookAuthor , bookGenre & releaseDate as a private
	 * variables of class Book Taking getters and setters Taking Books as a array
	 * with parameterised arguments Taking toString to print Book as a array
	 */
	private String bookName, bookAuthor, bookGenre, releaseDate;

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

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Books(String bookName, String bookAuthor, String bookGenre, String releaseDate) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Books [bookName :" + bookName + ",\n bookAuthor:" + bookAuthor + ",\n bookGenre:" + bookGenre
				+ ",\n releaseDat:" + releaseDate + "]\n";
	}

}
