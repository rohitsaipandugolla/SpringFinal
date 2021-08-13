<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
  .b1{
      width: 530px;
      height: 57px;
      font-size: xxx-large;
  }
  .main{
  margin-left:458px;
 margin-top:300px;
  }
</style>
<title> Customer Confirmation </title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>

<body class="main">
      <form:form action="generateQuiz">
          <input class="btn btn-info b1" style="font-size: xx-large" type="submit" value="Start Quiz"/>
      </form:form>
</body>
</html>