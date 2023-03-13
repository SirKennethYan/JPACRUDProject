<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Show</title>
<jsp:include page="bootstrapHead.jsp" />

</head>

<body style="background-color:#33475b">
<jsp:include page="navbar.jsp" />

<div class="container-fluid">

<div style="color: white;">
<h1>Create a new Show:</h1>

	<form action="created.do" method="POST">
   
		<label for="name">Name</label> 
		<input type="text" name="name" required /> 
	
		<label for="releaseYear">Release Year</label> 
		<input type="text" name="releaseYear" /> 
		
		<label for="description">Description</label> 
		<input type="text" name="description" /> 
		
		<label for="seasons">Seasons</label> 
		<input type="text" name="seasons" />  
		
		<label for="episodeCount">Episode Count</label> 
		<input type="text" name="episodeCount" />  
			
		<input class="btn btn-dark" type="submit" value="Submit" /> 
				
	</form>
	

</div>	
</div>
<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>