<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title> QUIZ </title>
<style>
.main{
 margin-left:150px;
 margin-top:30px;
 }
 .font{
  font-weight:bold;
 }
 .margin{
  width:800px;
  }
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

<style>.error{color:red}</style>
</head>

<body class="main">
  <form:form action="saveQuestion" modelAttribute="addquestion">
  <div class="font"> Enter Question:</div>
  <form:input path="question" class="margin"/>
  <form:errors path="question" cssClass="error"/>
  <br><br>
  <div class="font">Enter Option1:</div>
    <form:input path="option1" class="margin"/>
    <form:errors path="option1" cssClass="error"/>
    <br><br>
  <div class="font">  Enter Option2:</div>
        <form:input path="option2" class="margin"/>
        <form:errors path="option2" cssClass="error"/>
    <br><br>
<div class="font">    Enter Option3:</div>
            <form:input path="option3" class="margin"/>
            <form:errors path="option3" cssClass="error"/>
        <br><br>
  <div class="font">  Enter Option4:</div>
                <form:input path="option4" class="margin"/>
                <form:errors path="option4" cssClass="error"/>
            <br><br>
   <div class="font"> Enter Correct Answer:</div>
                    <form:input path="correctanswer" class="margin"/>
                    <form:errors path="correctanswer" cssClass="error"/>
                <br><br>
  <input type="submit" value="Save" class="btn btn-success btn-lg btn-block margin"/>
  </form:form>
  <br><br>
  <h5><a href="questions">Back to Quesions</a></h5>
</body>
</html>