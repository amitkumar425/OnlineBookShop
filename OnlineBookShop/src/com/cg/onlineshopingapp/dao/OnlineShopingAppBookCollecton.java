package com.cg.onlineshopingapp.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.cg.onlineshopingapp.pojo.Books;
import com.cg.onlineshopingapp.pojo.BooksToBeAddedToCart;

public class OnlineShopingAppBookCollecton {
	private static Map<Integer,Books> availableBooks = new HashMap<>();
	private static Set<BooksToBeAddedToCart> booksAddedToCart = new TreeSet<>();
	
	static {
		Books mathematics = new Books(100, "Mathematics", "R.D Sharma", 500, 1000);
		availableBooks.put(100, mathematics);
		
		Books science = new Books(101, "Science", "S Chand", 250, 300);
		availableBooks.put(101, science);
		
		Books english = new Books(102, "English", "R.D Thakur", 300, 100);
		availableBooks.put(102, english);
		
		Books hindi = new Books(103, "Hindi", "Prem Chandra", 150, 100);
		availableBooks.put(103, hindi);
		
		Books springData = new Books(104, "Spring Data", "John Write", 500, 600);
		availableBooks.put(104, springData);
		
		Books coreJava = new Books(105, "Core Java", "Herbert Shield", 1500, 2500);
		availableBooks.put(105, coreJava);
		
		Books headFirstJava = new Books(106, "Head First Java", "H.D wringles", 500, 400);
		availableBooks.put(106, headFirstJava);
		
		Books headFirstJsp = new Books(107, "Head First JSP", "H.D Wringles", 400, 300);
		availableBooks.put(107, headFirstJsp);
	}
	
	public static  Map<Integer,Books> viewAllAvailableBooks(){
		return availableBooks;
	}
	
	public static Set<BooksToBeAddedToCart> viewAllAddedBooks(){
		return booksAddedToCart;
	}

	public int getCounter;
	public int getCountersfuyd;
	

	public void deleteBookFromCart(int bookID) {
		for(BooksToBeAddedToCart book : booksAddedToCart) {
			if(book.getBookObject().getBookID()==bookID) {
				booksAddedToCart.remove(book);
				break;
			}
		}
	}

	public void addBookToCart(Books books, int i) {
		BooksToBeAddedToCart book = new BooksToBeAddedToCart(books, i);
		booksAddedToCart.add(book);
	}

	public int getCounter() {
		int counter=0;
		for(BooksToBeAddedToCart book : booksAddedToCart) {
			counter+=book.getCounterForThisBook();
		}
		return counter;
	}

	
}
