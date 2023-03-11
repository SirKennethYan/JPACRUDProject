<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
</head>
<body>
	<h1>Favorite Shows</h1>


	<c:choose>
		<c:when test="${empty animeshows}">No Animeshows found.</c:when>
		<c:otherwise>
			<c:forEach var="as" items="${animeshows }">
			
			<!-- TODO display in a nice table -->
			
			 <li>${as.id } ${as.name }</li>
			</c:forEach>
		</c:otherwise>
	</c:choose>




</body>
</html>