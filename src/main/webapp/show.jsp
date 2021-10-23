<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css">
    <title>Banco</title>
</head>
<div class="container">
    <body>
    <h2>
        <br/>
        <small class="text-muted">Banco Central UMG</small>
    </h2>

    <div class="col-lg-12">
        <div class="row">
            <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                <jsp:include page="session.jsp"/>
            </div>
            <p></p>
            <div class="d-grid gap-2 d-md-flex justify-content-md-start">
                <a class="btn btn-secondary" href="account-control?action=new" role="button">Nuevo registro</a>
            </div>
        </div>
    </div>

    <table class="table table-bordered" width="50%">
        <thead>
        <tr>
            <th scope="col">Nombre</th>
            <th scope="col">Segundo Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Segundo Apellido</th>
            <th scope="col">DPI</th>
            <th></th>
            <th></th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="cliente" items="${lista}">
            <tr>
                <td><c:out value="${cliente.firstName}"/></td>
                <td><c:out value="${cliente.secondName}"/></td>
                <td><c:out value="${cliente.firstLastName}"/></td>
                <td><c:out value="${cliente.secondLastName}"/></td>
                <td><c:out value="${cliente.dpi}"/></td>
                <td>
                    <a href="account-control?action=update&profileId=<c:out value="${cliente.profileId}"/>">Modificar</a>
                </td>
                <td>
                    <a href="account-control?action=delete&profileId=<c:out value="${cliente.profileId}"/>">Eliminar</a>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>

    <div class="d-grid gap-2 d-md-flex justify-content-md-center">
        <br/>
        <a class="btn btn-info" href="report-Controller?create=generate" role="button">Generar Reporte</a>
        <br/>
    </div>

    </body>
</div>
</html>