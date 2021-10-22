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
    <br/>
    <body>
    <section class="vh-100">
        <div class="container-fluid mt-5">
            <div class="row">
                <div class="col-sm-6 text-black">

                    <div class="px-5 ms-xl-4">
                        <span class="h1 fw-bold mb-0 pb-3">Banco Central UMG</span>
                    </div>

                    <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                        <form style="width: 23rem;" action="login-Controller" method="post">
                            <input type="hidden" name="auth" value="login"/>
                            <h3 class="fw-normal mb-2 pb-2" style="letter-spacing: 1px;">Inicio de sesión</h3>

                            <div class="form-outline mb-4">
                                <input type="text" id="userName" name="userName" class="form-control form-control-lg"/>
                                <label class="form-label" for="userName">Usuario</label>
                            </div>

                            <div class="form-outline mb-4">
                                <input type="password" id="passdAsign" name="passAsign"
                                       class="form-control form-control-lg"/>
                                <label class="form-label" for="passdAsign">Contraseña</label>
                            </div>

                            <div class="pt-1 mb-4">
                                <button class="btn btn-info btn-lg btn-block" type="submit">Iniciar sesión</button>
                            </div>

                            <c:set var="message" value="${requestScope.message}"/>
                            <c:if test="${not empty message}">
                                <div class="alert alert-danger alert-dismissible fade show" role="alert">
                                        ${message}
                                    <button type="button" class="btn-close" data-bs-dismiss="alert"
                                            aria-label="Close"></button>
                                </div>
                            </c:if>

                        </form>
                    </div>
                </div>

                <div class="col-sm-6 px-0 d-none d-sm-block">
                    <img src="http://4.bp.blogspot.com/-3wxAioq5XDw/Td1414dz3QI/AAAAAAAAAlA/XRnt8LzduVU/s1600/Logo+UMG.png"
                         alt="Login image" class="w-50 vh-50" style="object-fit: cover; object-position: left;">
                    <h6 class="form-label" id="single">Proyecto 2</h6>
                </div>

            </div>
        </div>
    </section>
    </body>
</div>
</html>