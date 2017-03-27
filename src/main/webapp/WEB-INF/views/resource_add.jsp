<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href='<spring:url value="/resources/css/global.css"/>' type="text/css">
	<link rel="stylesheet" href='<spring:url value="/resources/css/bootstrap-select.min.css"/>'>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>
	
</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	<div class="container">
	
		<div class="row">
			<h2>Resource</h2>
		</div>
		
		<spring:url value="/resource/review" var="formUrl"/>
		<form:form action="${formUrl}" method="POST" modelAttribute="resource">
		
			<div class="row">
				
				<div class="form-group">
					<label for="resource-name">Name</label> 
					<form:input path="name" cssClass="form-control"
						id="resource-name"/>
				</div>

				<div class="form-group">
					<label for="resource-type">Type</label> 
					<form:select path="type" items="${typeOptions}" cssClass="selectpicker"/>
				</div>

				<div class="form-group">
					<label for="cost">Cost</label> <input id="cost" type="text"
						class="form-control" name="cost" />
				</div>

				<div class="form-group">
					<label for="unit">Unit of Measure</label> 
					<form:radiobuttons path="unitOfMeasure" items="${radioOptions}"/>
				</div>
				
				<div class="form-group">
					<label for="indicators">Indicators</label> 
					<form:checkboxes id="indicators" path="indicators" items="${checkOptions}"/>
				</div>
				
				<div class="form-group">
					<label for="notes">Notes</label> 
					<form:textarea id="notes" path="notes" class="form-control" rows="3"/>
				</div>
				
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</form:form>
	</div>
</body>
</html>