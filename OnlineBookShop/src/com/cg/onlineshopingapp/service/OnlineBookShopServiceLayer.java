package com.cg.onlineshopingapp.service;

import java.util.Map;
import java.util.Set;

import com.cg.onlineshopingapp.dao.OnlineShopingAppBookCollecton;
import com.cg.onlineshopingapp.pojo.Books;
import com.cg.onlineshopingapp.pojo.BooksToBeAddedToCart;

public class OnlineBookShopServiceLayer {
	private OnlineShopingAppBookCollecton bookCollection = new OnlineShopingAppBookCollecton();

	public static Map<Integer, Books> viewAllAvailableBooks() {
		return OnlineShopingAppBookCollecton.viewAllAvailableBooks();
	}

	public static Set<BooksToBeAddedToCart> viewAllAddedBooks() {
		return OnlineShopingAppBookCollecton.viewAllAddedBooks();
	}

	public void addBookIntoCart(int bookID) {
		int flag = 0;
		for (BooksToBeAddedToCart book : OnlineShopingAppBookCollecton.viewAllAddedBooks()) {
			if (book.getBookObject().getBookID() == bookID) {
				book.setCounterForThisBook(book.getCounterForThisBook() + 1);
				flag++;
				break;
			}
		}
		if (flag == 0) {
			bookCollection.addBookToCart(OnlineShopingAppBookCollecton.viewAllAvailableBooks().get(bookID),1);
		}
	}

	public void deletBookFromCart(int bookID) {
		int flag = 0;
		for (BooksToBeAddedToCart book : OnlineShopingAppBookCollecton.viewAllAddedBooks()) {
			if (book.getBookObject().getBookID() == bookID) {
				if (book.getCounterForThisBook() > 1) {
					book.setCounterForThisBook(book.getCounterForThisBook() - 1);
				} else {
					bookCollection.deleteBookFromCart(bookID);
					break;
				}
			}
		}
	}

	public int getCounter() {
		return bookCollection.getCounter();
	}

	public double getPrice() {
		double price=0;
		for(BooksToBeAddedToCart book : bookCollection.viewAllAddedBooks()) {
			price+=(book.getCounterForThisBook())*(book.getBookObject().getBookPrice());
		}
		return price;
	}

}
