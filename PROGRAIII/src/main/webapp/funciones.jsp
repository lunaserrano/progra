<!DOCTYPE html>
<html lang="es">
<head>
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<meta charset="utf-8">
	<title>Agregar</title>
	<%
	String idBus = request.getParameter("idBus");
	String NombrePr = request.getParameter("NombrePr");
	String PrecioPr = request.getParameter("PrecioPr");
	String CantidadPr = request.getParameter("CantidadPr");
	String TotalPr = request.getParameter("TotalPr");
	
	if(idBus==null){
		idBus = "";
		NombrePr = "";
		PrecioPr = "";
		CantidadPr = "";
		TotalPr = "";
	}
		
	%>
	
	
</head>
<body>

<h2 align="center">AGREGAR DATOS</h2>
<form action="ServeleteControler">
<table align="center">
	<thead>
		<tbody>
			<tr>
				<td>
					
						<p>id</p><input type="text" name="id" value="<%=idBus%>">
						<p>Nombre producto</p><input type="text" name="Nproductos" value="<%=NombrePr%>">
						<p>Precio producto</p><input type="text" name="Pproductos" value="<%=PrecioPr%>">
						<p>Cantidad de productos</p><input type="text" name="Cproductos" value="<%=CantidadPr%>">
						<p>Total de producto</p><input type="text" name="Tproductos" value="<%=TotalPr%>">
						<br>
						<br>
					
				</td>
			</tr>
		</tbody>
	</thead>
</table>
<input type="submit" class="btn btn-info" value="Actualizar" name="btn">
<input type="submit" class="btn btn-info" value="Guardar" name="btn">
</form>
</body>
</html>