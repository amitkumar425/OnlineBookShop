<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	
	<jsp:include page="Header.jsp"></jsp:include>

	<table border="1" align="center">
		<tr>
			<th colspan="20" rowspan="1" align="center">List Of Books Available</th>
		</tr>
		<tr>
			<td>Book ID</td>
			<td>Book Name</td>
			<td>Author</td>
			<td>No. OF Pages</td>
			<td>Price</td>
			<td>Link</td>
		</tr> 
		
		<jstl:forEach var="bookID" items="${sessionScope.availableBooks.keySet() }">
			<tr>
				<td>${sessionScope.availableBooks.get(bookID).bookID }</td>
				<td>${sessionScope.availableBooks.get(bookID).bookName }</td>
				<td>${sessionScope.availableBooks.get(bookID).bookAuthor }</td>
				<td>${sessionScope.availableBooks.get(bookID).numberOfPages }</td>
				<td>${sessionScope.availableBooks.get(bookID).bookPrice }</td>
				<td><a href="addBookToCart.osac?bID=${sessionScope.availableBooks.get(bookID).bookID }">ADD TO CART</a></td>
			</tr>
		</jstl:forEach>
		
	</table>
	
	<jsp:include page="Footer.jsp"></jsp:include>

</div>



</body>
</html>