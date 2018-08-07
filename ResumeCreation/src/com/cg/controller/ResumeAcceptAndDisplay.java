//this is the Controller class.
//It is the Servlet class that directs the request. 

package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.resume.Resume;

/**
 * Servlet implementation class ResumeAcceptAndDisplay
 */
@WebServlet("/ResumeAcceptAndDisplay")
public class ResumeAcceptAndDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Resume resume;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String qualification = request.getParameter("qualification");
		String dob = request.getParameter("dob");
		String[] hobbies = request.getParameterValues("hobbies");
		String address = request.getParameter("address");
		String[] skills = request.getParameterValues("skills");
		String email = request.getParameter("email");
		String website = request.getParameter("website");
		String contactNumber = request.getParameter("contactNumber");
		String summary = request.getParameter("summary");
		String reset = request.getParameter("reset");
		String submit = request.getParameter("submit");
		String photo = request.getParameter("photo");
		
		resume = new Resume(fname, lname, gender, qualification, dob,photo, address, email, website, contactNumber, summary,
				reset, submit, hobbies, skills);
		
		request.setAttribute("ResumeObject",resume);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Index2.jsp");
		
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
