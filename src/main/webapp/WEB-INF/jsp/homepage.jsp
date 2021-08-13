<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

<style>
   .form{
   margin-left:300px;
   margin-right:300px;
   margin-top:150px;
   }.bt{
     margin-left:780px;
   }
</style>
</head>
<body>
<div class="form">
<div>
 <h1>  Welcome to Home page</h1>
</div>
<hr>
<p>

</p>
<hr>
<security:authorize access="hasRole('ADMIN')">
   <p>
     <a href="${pageContext.request.contextPath}/admin">Admin Page</a>
     (only for admin peeps)
   </p>
   </security:authorize>
<hr>
   <p>
     <a href="processForm">User Page</a>
     (only for admin and user peeps)
   </p>
<hr>

<p>
   User: <security:authentication property="principal.username"/>
   <br><br>
   Role(s): <security:authentication property="principal.authorities"/>
</p>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">
     <input class="btn btn-secondary bt" type="submit" value="Logout"/>
</form:form>
</div>
</body>
</html>