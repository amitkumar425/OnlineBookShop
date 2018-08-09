package com.cg.onlineshopingapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.onlineshopingapp.service.OnlineBookShopServiceLayer;

/**
 * Servlet implementation class OnlineShopingAppController
 */
@WebServlet("*.osac")
public class OnlineShopingAppController extends HttpServlet {
	
	
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OnlineBookShopServiceLayer serviceLayer = new OnlineBookShopServiceLayer();
		
		String action = request.getServletPath();
		int bookID ;
		
		HttpSession session = request.getSession();
		
		RequestDispatcher requestDispatcher ;
		switch (action) {
		case "/addBookToCart.osac":
			bookID = Integer.parseInt(request.getParameter("bID"));
			serviceLayer.addBookIntoCart(bookID);
			session.setAttribute("noOfBooksInItem",serviceLayer.getCounter());
			session.setAttribute("totalPrice",serviceLayer.getPrice());
			session.setAttribute("cartDetails", serviceLayer.viewAllAddedBooks());
			requestDispatcher = request.getRequestDispatcher("Home.jsp");
			requestDispatcher.forward(request, response);
			break;
		case "/show.osac":
			session.setAttribute("availableBooks", serviceLayer.viewAllAvailableBooks());
			session.setAttribute("noOfBooksInItem",serviceLayer.getCounter());
			session.setAttribute("totalPrice",serviceLayer.getPrice());
			response.sendRedirect("Home.jsp");
			break;
			
		case "/removeBookFromCart.osac":
			bookID =  Integer.parseInt(request.getParameter("bID"));
			serviceLayer.deletBookFromCart(bookID);
			session.setAttribute("cartDetails", serviceLayer.viewAllAddedBooks());
			requestDispatcher = request.getRequestDispatcher("CartDetails.jsp");
			session.setAttribute("noOfBooksInItem",serviceLayer.getCounter());
			session.setAttribute("totalPrice",serviceLayer.getPrice());
			requestDispatcher.forward(request, response);
		default:
			break;
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
