<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>

	<title>Duomenų Bazė</title>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  	  <link rel="stylesheet" href="/resources/demos/style.css">
      <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
      <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
  $( function() {
    $( "#date" ).datepicker({
    	dateFormat: "yy-mm-dd",
    	yearRange: "1900:2017",
    	changeMonth: true,
      changeYear: true
    });
  } );
  </script>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body onload="insertText();">

<div id="left" style="float:left; width:50%;">
<h1>
	Pridėti žmogų:
</h1>
<c:url var="addAction" value="/person/add" ></c:url>

<form:form action="${addAction}" commandName="person">

<table>
	<c:if test="${!empty person.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Vardas"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="lname">
				<spring:message text="Pavardė"/>
			</form:label>
		</td>
		<td>
			<form:input path="lname" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="date">
				<spring:message text="Data"/>
			</form:label>
		</td>
		<td>
			<form:input path="date" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty person.name}">
				<input type="submit"
					value="<spring:message text="Atnaujinti duomenis"/>" />
			</c:if>
			<c:if test="${empty person.name}">
				<input type="submit"
					value="<spring:message text="Pridėti žmogų"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>




<c:if test="${!empty listPersons}">
<h3>Žmonių sąrašas</h3>
	<table class="tg">
	<tr>
		<th width="20">ID</th>
		<th width="120">Vardas</th>
		<th width="120">Pavardė</th>
		<th width="120">Data</th>
		<th width="60">Redaguoti</th>
		<th width="60">Ištrinti</th>
		<th width="60">Giminaičiai</th>
	</tr>
	<c:forEach items="${listPersons}" var="person">
		<tr>
			<td>${person.id}</td>
			<td>${person.name}</td>
			<td>${person.lname}</td>
			<td>${person.date}</td>
			<td><a href="<c:url value='/edit/${person.id}' />" >Redaguoti</a></td>
			<td><a href="<c:url value='/remove/${person.id}' />" >Ištrinti</a></td>
			<td><a href="<c:url value='/family/${person.id}' />" >Giminaičiai</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</div> 
 <div id="right" style="right:0px; width:50%; position:fixed;">



<c:if test="${!empty listPersonsFamily}">
<h3>Giminaičių sąrašas</h3>
 <table class="tg">
 <tr>
  <th width="20">ID</th>
  <th width="120">Vardas</th>
  <th width="120">Pavardė</th>
  <th width="120">Data</th>
  <th width="60">Redaguoti</th>
  <th width="60">Ištrinti</th>
  
 </tr>
 <c:forEach items="${listPersonsFamily}" var="person">
  <tr>
   <td>${person.id}</td>
   <td>${person.name}</td>
   <td>${person.lname}</td>
   <td>${person.date}</td>
   <td><a href="<c:url value='/edit/${person.id}' />" >Redaguoti</a></td>
   <td><a href="<c:url value='/remove/${person.id}' />" >Ištrinti</a></td>
  </tr>
 </c:forEach>
 </table>
 <a href="<c:url value='/' />" >Atgal i žmonių sąrašą</a>
</c:if>
</div> 
</body>
</html>