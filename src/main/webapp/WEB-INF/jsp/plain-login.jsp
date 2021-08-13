<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Custom Login Form</title>
<style> .failed{color:red};</style>
<style> .logged{color:green};</style>
<style>
   .center1{
          text-align: center;
          margin: auto;
          width: auto;
          padding-top: 250px;
          height: -webkit-fill-available;
          margin-top: 160px;
              margin-left: 400px;
              margin-right: 400px;
              border: 3px #2c2a2a solid;
   }.form{

   }
   .inputs{
   width: 392px;
       height: 30px;
   }
   .btn{
   color: white;
       background-color: green;
       width: 350px;
       height: 40px;
       font-size: larger;
   }.text{
      font-size:x-large;
   }
   .main{

        outline: none;
   }
   .head{
   }
</style>
</head>
<body style="background-color:white">
<div class="center1">
<h1 style="margin-top:-200px"> Login Page</h1>
     <form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">

    <c:if test="${param.error!=null}">
       <i class="failed">Sorry! invalid username/password.</i>
    </c:if>

    <c:if test="${param.logout!=null}">
           <i class="logged">You have been logged out.</i>
    </c:if>

   <div class="form">
       <p class="text">
          User name: <input class="inputs" type="text" name="username"/>
       </p>
        <p class="text">
          Password: <input class="inputs" type="password" name="password"/>
        </p>
        <input class="btn" type="submit" value="Login"/>
        <br><br>
        <input  type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
     </form>

       <a  href="signup">Sign Up</a>
  </div>
</div>
</body>
</html>