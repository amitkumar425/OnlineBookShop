package com.cg.onlineshopingapp.pojo;


public class BooksToBeAddedToCart implements Comparable<BooksToBeAddedToCart>{
	private Books bookObject;
	private int counterForThisBook;
	
	public BooksToBeAddedToCart(Books bookObject, int counterForThisBook) {
		this.bookObject = bookObject;
		this.counterForThisBook = counterForThisBook;
	}

	public int getCounterForThisBook() {
		return counterForThisBook;
	}

	public void setCounterForThisBook(int counterForThisBook) {
		this.counterForThisBook = counterForThisBook;
	}

	public Books getBookObject() {
		return bookObject;
	}

	@Override
	public int compareTo(BooksToBeAddedToCart book) {
		return this.getBookObject().getBookID()-book.getBookObject().getBookID();
	}
	
	
	
}
