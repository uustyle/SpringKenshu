<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
<script>
$(function() {
  $.getJSON("./data.json" , function(data) {
    var
      ulObj = $("#demo"),
      len = data.length;

    for(var i = 0; i < len; i++) {
      ulObj.append($("<li>").attr({"id":data[i].id}).text(data[i].name));
    }
  });
});
</script>		
		
	</head> 
	<body>
	<ul id="demo"></ul>
		<h2>${message}</h2>
	</body>
</html>
