<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>

<html>
<head>
<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="/estilo/estilo.css"/>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="container">
	
	
	<div class="row">
		<form:form class="col s6" method="POST" modelAttribute="cotacao">
		<p><h5>Conversor de Dolar para Real</h5></p>
			<div class="row">
				<div class="input-field col s6">
				  <i class="material-icons prefix">attach_money</i>
				  <form:input path="dolar" id="icon_prefix" class="validate" />
				  <label for="icon_prefix">Digite o Valor em Dolar</label>
				</div>
			</div>  
			
		<form:button class="btn waves-effect waves-light">Calcular
			<i class="material-icons right">send</i>
		</form:button>	 
		 
		<div class="exiberesultado">
			<p style="background:#00FF40;">Valor em Real: R$ ${mensagem}</p>
		</div>
		
		</form:form>
	</div>
</div>


</body>
</html>