<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title> QUIZ </title>
<style>
 .quiz{
     background-color: #0088ff;
     display:flex;
     margin-left: 300px;
     margin-right: 300px;
    padding-left: 350px;

  }
  .bt2{
  background-color: #0088ff;
  }
  .align-center {
    display: flex;
    justify-content: center;
  }
  .submit{
   background-color: #0088ff;
      display: flex;
      margin: auto;
      margin-bottom: 50px;
      align-items: center;
      padding-left: 35px;
      border-color: #0088ff;
          width: 200px;
          height: 40px;
          border-radius: 10px;
          color: white;
          font-size: 24px;
          font-family: ui-rounded;
          font-weight: bold;
  }
  .head{
      margin-top: 30px;
      margin-left: 630px;
      color: firebric
      background-color: lavenderblush;
      display:flex;
      text-align:center
      background-color: darkgray;
      padding-left: 85px;
  }
  .form{
         background-color: aliceblue;
         margin-left: 300px;
         margin-right: 300px;
          display:flex;
         text-align:justify
  }.main{
  background-color:#caddee;
  }
  .typo{
  color: white;
      font-family: sans-serif;
      font-size: 23px;
      }
   .li{
   font-weight: bolder;
       font-size: larger;
       }
</style>
</head>

<body class="main">



 <form:form action="answerForm" className="d-flex justify-content-center" modelAttribute="questionPaper">
 <div>
   <div class="quiz">
   <h3 class="typo">Take Quiz</h3>
   </div>
   <div class="form">
  <br><br>
  <div class="align-center">
  <ol>
     <c:forEach var="temp" varStatus="loop" items="${questionPaper.questions}">
     <div>
        <li class="li"> ${temp.question} </li>
        <br><br>
         <form:input path="questions[${loop.index}].correctanswer" type="hidden"/>
        Choose one option:
         <div class="opt">
        <br><br>
               <form:radiobutton path="questions[${loop.index}].useranswer"  value="${temp.option1}" id="${temp.question}"/>
               ${temp.option1}
               <br><br>
                <form:radiobutton path="questions[${loop.index}].useranswer" value="${temp.option2}" id="${temp.question}"/>
                ${temp.option2}
                              <br><br>
                <form:radiobutton path="questions[${loop.index}].useranswer" value="${temp.option3}" id="${temp.question}"/>
                 ${temp.option3}
                              <br><br>

                <form:radiobutton path="questions[${loop.index}].useranswer" value="${temp.option4}" id="${temp.question}"/>

                 ${temp.option4}
         <br><br>

         </div>
     </div>
     </c:forEach>
  </ol>
  </div>
  <input  type="submit" value="Submit Quiz" class="submit"/>
  </div>
  </div>
  </form:form>
</body>
</html>