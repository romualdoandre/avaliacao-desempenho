<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:p="http://primefaces.org/ui"
	xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
	xmlns:c="http://xmlns.jcp.org/jsp/jstl/core"
	xmlns:f="http://xmlns.jcp.org/jsf/core">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Avaliação de Desempenho</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/simplex/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
</head>

<body>
	<form method="get" action="AvdController"/>
					Cadastra avaliação
		
			<input type="hidden" name="id" /> 
			
			 <input type="text" name="ano" 
			 value="${avd.anoAvd}"/>
				
				<input type="submit" name="action" value="Cadastrar" />

</body>
</html>