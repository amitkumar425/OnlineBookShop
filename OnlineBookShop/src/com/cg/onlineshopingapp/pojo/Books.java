package com.cg.onlineshopingapp.pojo;

public class Books {
	
	private int bookID;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private int numberOfPages;
	
	public Books(int bookID, String bookName, String bookAuthor, double bookPrice, int numberOfPages) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.numberOfPages = numberOfPages;
	}
	
	
	public int getBookID() {
		return bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}


	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", numberOfPages=" + numberOfPages + "]";
	}
	
	
	
	
}
