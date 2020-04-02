<html>
  <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<body>
<h2>AGREGAR DATOS</h2>
  <table align="center">
    <thead></thead>

    <tbody>
      <tr>
        <td style="width:100%; heigth:100%">
          <form class="" action="ServeleteControler" method="post">
                <p>Id</p><input type="text" name="Id" value="">
                <p>Nombre producto</p><input type="text" name="Pnombre" value="">
                <p>Precio producto</p><input type="text" name="Pprecio" value="">
                <p>Cantidad producto</p><input type="text" name="Pcantidad" value="">
                <p>Total producto</p><input type="text" name="Ptotal" value="">
                <br>
                  <hr>
                <input type="submit" name="btn" value="agregar" class="btn btn-info">
                  <input type="submit" name="btn" value="eliminar" class="btn btn-info">
                  <input type="submit" name="btn" value="modificar" class="btn btn-info">
          </form>
        </td>
      </tr>
    </tbody>
  </table>
</body>
</html>
