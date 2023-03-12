<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Shows by ID</title>
<jsp:include page="bootstrapHead.jsp"/>

</head>
<body>
<jsp:include page="navbar.jsp"/> 

	<div class="search">

		<h2>
			<a href="home.do">Home</a>
		</h2>
		
		<br>

		<div class="justturnred">
			<h1>Search Show by ID</h1>
		</div>
		
		<form action="id.do" method="GET">
			<input type="text" name="id" id="id"> <input type="submit"
				value="submit">
		</form>
		
	</div>
</body>
</html>