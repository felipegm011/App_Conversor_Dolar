<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="row">
    <form class="col s6">
      <div class="row">
        <div class="input-field col s6">
          <i class="material-icons prefix">attach_money</i>
          <input id="icon_prefix" type="number" class="validate">
          <label for="icon_prefix">Digite o Valor em Dolar</label>
        </div>
	<button class="btn waves-effect waves-light" name="action">Submit
		<i class="material-icons right">send</i>
	</button>
</div>  	 

    </form>
  </div>

<p>${mensagem}</p>
</body>
</html>