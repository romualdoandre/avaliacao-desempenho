<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h:form>
		<h:outputLabel value="Digite o ano" />
		<h:inputText value="#{avd.anoAvd}" />
		<h:commandButton value="Ok" action="#{avdController.addAvd(avd)}" />

		<table id="table-1" border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>ANO</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="avd" items="#{avdController.listAll_avd()}">

					<tr>
						<td>#{avd.idAvd}</td>
						<td>#{avd.anoAvd}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</h:form>
</body>
</html>