<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <title>Banco</title>
</head>
<div class="container">
<body>
    <br/>
    <h1>
    <small class="text-muted">Nuevo Registro</small>
    </h1>

    <br/>

    <form action="account-control?action=insert" method="post" autocomplete="off">
        <div class="input-group mb-3">
            <input type="hidden" id="profileId" name="profileId" class="form-control" placeholder="profileId" aria-label="profileId" aria-describedby="basic-addon1" width="80%">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">Nombre</span>
            <input type="text" id="firstName" name="firstName" class="form-control" placeholder="firstName" aria-label="firstName" aria-describedby="basic-addon2" width="80%">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon3">Segundo Nombre</span>
            <input type="text" id="secondName" name="secondName" class="form-control" placeholder="secondName" aria-label="secondName" aria-describedby="basic-addon3" width="80%">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon4">Primer Apellido</span>
            <input type="text" id="firstLastName" name="firstLastName" class="form-control" placeholder="firstLastName" aria-label="firstLastName" aria-describedby="basic-addon4" width="80%">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon5">Segundo Apellido</span>
            <input type="text" id="secondLastName" name="secondLastName" class="form-control" placeholder="secondLastName" aria-label="secondLastName" aria-describedby="basic-addon5" width="80%">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon6">DPI</span>
            <input type="text" id="dpi" name="dpi" class="form-control" placeholder="dpi" aria-label="dpi" aria-describedby="basic-addon6" width="80%">
        </div>

        <button class="btn btn-secondary" id="guardar" name="guardar" type="submit">Guardar</button>
        <a class="btn btn-secondary" href="account-control?action=back" role="button">Regresar</a>
    </form>
</body>
</div>
</html>
