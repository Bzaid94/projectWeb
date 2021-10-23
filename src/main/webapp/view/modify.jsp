<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<html>
<head>
    <title>Banco</title>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

</head>
<div class="container">
    <body>
    <br/>
    <h1>
        <small class="text-muted">Modificar Registro</small>
    </h1>

    <br/>

    <form action="account-control?action=modify" method="post" autocomplete="off">
        <div class="input-group mb-3">
            <input type="hidden" id="profileId" name="profileId" class="form-control" placeholder="profileId"
                   aria-label="profileId" aria-describedby="basic-addon1" width="80%"
                   value="<c:out value="${cliente.profileId}" />">
        </div>

        <div class="input-group mb-3">
            <input type="hidden" id="productId" name="productId" class="form-control" placeholder="productId"
                   aria-label="productId" aria-describedby="basic-addon1" width="80%"
                   value="<c:out value="${producto.productId}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">Nombre</span>
            <input type="text" id="firstName" name="firstName" class="form-control" placeholder="firstName"
                   aria-label="firstName" aria-describedby="basic-addon2" width="80%"
                   value="<c:out value="${cliente.firstName}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon3">Segundo Nombre</span>
            <input type="text" id="secondName" name="secondName" class="form-control" placeholder="Segundo Nombre"
                   aria-label="secondName" aria-describedby="basic-addon3" width="80%"
                   value="<c:out value="${cliente.secondName}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon4">Primer Apellido</span>
            <input type="text" id="firstLastName" name="dpi" class="form-control" placeholder="Apellido"
                   aria-label="firstLastName" aria-describedby="basic-addon4" width="80%"
                   value="<c:out value="${cliente.firstLastName}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon5">Segundo Apellido</span>
            <input type="text" id="secondLastName" name="secondLastName" class="form-control"
                   placeholder="Segundo Apellido" aria-label="secondLastName" aria-describedby="basic-addon5"
                   width="80%"
                   value="<c:out value="${cliente.secondLastName}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon6">DPI</span>
            <input type="text" id="dpi" name="dpi" class="form-control" placeholder="dpi" aria-label="dpi"
                   aria-describedby="basic-addon6" width="80%" value="<c:out value="${cliente.dpi}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon7">Producto</span>
            <input type="text" id="product" name="product" class="form-control" placeholder="Producto"
                   aria-label="product"
                   aria-describedby="basic-addon7" width="80%" value="<c:out value="${producto.product}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon8">Monto</span>
            <input type="text" id="amount" name="amount" class="form-control" placeholder="Monto" aria-label="amount"
                   aria-describedby="basic-addon8" width="80%" value="<c:out value="${producto.amount}" />">
        </div>

        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon9">Moneda</span>
            <input type="text" id="currency" name="currency" class="form-control" placeholder="Moneda"
                   aria-label="currency"
                   aria-describedby="basic-addon9" width="80%" value="<c:out value="${producto.currency}" />">
        </div>

        <button class="btn btn-secondary" id="guardar" name="guardar" type="submit">Guardar</button>
        <a class="btn btn-secondary" href="account-control?action=back" role="button">Regresar</a>
    </form>
    </body>
</div>
</html>