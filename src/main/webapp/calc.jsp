<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calc</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <form action="/calc" method="post">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Number 1</label>
                    <input type="number" name="num1" class="form-control" required id="exampleInputEmail1">
                </div>
                <select class="form-select" required name="operation" aria-label="Default select example">
                    <option selected disabled>Please select operation</option>
                    <option value="add">Add</option>
                    <option value="sub">Sub</option>
                    <option value="mult">Mult</option>
                    <option value="div">Div</option>
                </select>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Number 2</label>
                    <input type="number" name="num2" class="form-control" required id="exampleInputPassword1">
                </div>
                <button type="submit" class="btn btn-primary">Calculate</button>
            </form>
            <%
                if (request.getAttribute("result") != null) {
            %>
            <div class="alert alert-success" role="alert">
                <p>Result: ${requestScope.result}</p>
            </div>
            <%
                }
            %>
        </div>
    </div>
</div>

</body>
</html>
