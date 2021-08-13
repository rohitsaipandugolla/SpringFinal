<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title> Admin Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<style>
.main{
   margin-left:300px;
   margin-right:300px;
   margin-top:150px;
}
.font{
 font-size:xx-large;
}
.b1{
width: 150px;
    height: 35px;
}
</style>
</head>

<body class="main">
<h1 class="font1">Admin Home Page</h1>
<hr>
<p>
  <h3 class="font">Welcome <security:authentication property="principal.username"/></h3>
</p>
<div>
<input class="btn btn-info b1" type="button" value="Questions" onclick="window.location.href='admin/questions';return false;"/>
  <input class="btn btn-info b1" type="button" value="Users" onclick="window.location.href='admin/users';return false;"/>
 </div>
<hr>
<a href="${pageContext.request.contextPath}/">Back to Home page</a>
</body>
</html>