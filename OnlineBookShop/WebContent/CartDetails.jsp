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

<jsp:include page="Header.jsp"></jsp:include>

<h2 align="center">Your Cart</h2>

	<jstl:if test="${sessionScope.noOfBooksInItem ==0 }">
		<jstl:redirect url="Error.jsp"></jstl:redirect>	
	</jstl:if>

	<jstl:if test="${requestScope.noOfBooksInItem !=0 }">
		
	<table border="1" align="center">
		<tr>
			<th colspan="20" rowspan="1" align="center">List Of Added Books</th>
		</tr>
		<tr>
			<td>Book ID</td>
			<td>Book Name</td>
			<td>Author</td>
			<td>No. OF Pages</td>
			<td>Price</td>
			<td>Count</td>
			<td>Link</td>
		</tr> 
		
		<jstl:forEach var="book" items="${sessionScope.cartDetails }">
			<tr>
				<td>${book.bookObject.bookID }</td>
				<td>${book.bookObject.bookName  }</td>
				<td>${book.bookObject.bookAuthor  }</td>
				<td>${book.bookObject.numberOfPages  }</td>
				<td>${book.bookObject.bookPrice  }</td>
				<td>${book.counterForThisBook  }</td>
				<td><a href="removeBookFromCart.osac?bID=${book.bookObject.bookID }">Remove From Cart</a></td>
			</tr>
		</jstl:forEach>
		
		</table>
	</jstl:if>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>