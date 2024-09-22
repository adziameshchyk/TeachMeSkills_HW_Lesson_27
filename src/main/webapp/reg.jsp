<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="card mt-5" style="width: 30rem;">
            <div class="card-body">
                <form action="/reg" method="post">
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="inputGroup-sizing-default-1">Name</span>
                        <input type="text" name="name" class="form-control" required aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    </div>
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="inputGroup-sizing-default-2">Login</span>
                        <input type="text" name="login" class="form-control" required aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    </div>
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="inputGroup-sizing-default-3">Password</span>
                        <input type="password" name="password" class="form-control" required aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
                    </div>
                    <button type="submit" class="btn btn-primary">Registration</button>
                </form>
            </div>
            <%
                if (request.getAttribute("userIsAdded") != null) {
                    if ((boolean) request.getAttribute("userIsAdded")) {
            %>
            <div class="alert alert-success" role="alert">
                <p>User added successfully.</p>
            </div>
            <%
                    } else {
            %>
            <div class="alert alert-danger" role="alert">
                <p>A user with this login already exists.</p>
            </div>
            <%
                    }
                }
            %>
        </div>
    </div> 
</div>

</body>
</html>
