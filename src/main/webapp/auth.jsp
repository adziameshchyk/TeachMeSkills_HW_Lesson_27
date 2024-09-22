<%--
  Created by IntelliJ IDEA.
  User: sdeme
  Date: 21.09.2024
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorization</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="card mt-5" style="width: 30rem;">
            <div class="card-body">
                <form action="/auth" method="post">
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="inputGroup-sizing-default-2">Login</span>
                        <input type="text" name="login" class="form-control" required aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    </div>
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="inputGroup-sizing-default-3">Password</span>
                        <input type="password" name="password" class="form-control" required aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    </div>
                    <button type="submit" class="btn btn-primary">Authorization</button>
                </form>
            </div>
            <%
                Boolean authIsFailed = (Boolean) request.getAttribute("authIsFailed");
                if (authIsFailed != null && authIsFailed) {
            %>
            <div class="alert alert-danger" role="alert">
                <p>Incorrect login or password.</p>
            </div>
            <%
            }
            %>
        </div>
    </div>
</div>

</body>
</html>
