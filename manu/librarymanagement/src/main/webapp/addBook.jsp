<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>ENTER THE BOOK DETAILS</h1>
<form action="addBook" modelAttribute="book">
<center>

<table>

<label for="name">name</label>
<input type="text" name="name"><br><br>


<label for="authorName">AuthorName</label>
<input type="text" name="AuthorName"><br><br>




<label for="publishYear">publishYear</label>
<input type="number" name="publishYear"><br><br>


<label for="genre">Genre</label>
<input type="text" name="Genre"><br><br>




</table>
<input type="submit">
<input type="reset">

</center>
</form>


</body>
</html>