<!DOCTYPE html>
<html>
<head>
<title> Customer Confirmation </title>
<style>.center{display:flex;
text-align:center}
.d1{
margin-top: 86px;
margin-left:303px;
font-size:70px;
color:#127ddb;
}
.d2{
margin-top: 220px;
margin-left: -590px;
 font-size: 25px;
     color: gray;
}
.d3{
    margin-top: 304px;
    margin-left: -374px;
font-size:50px;
width:356px;
background-color:#127ddb;
color:white;
}.b1{
    height: 43px;
    margin-left: 300px;
    margin-top: 28px;
}
</style>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

</head>

<body class=center>
<h1 class="d1">Thanks for taking the Quiz</h2>
<br>
</br>

<h4 class="d2">You achieved the following result.</h4>
<br/>
 <h5 class="d3">    ${score}/${MaxScore} </h5>
  <a class="btn btn-info b1" href="${pageContext.request.contextPath}/">Back to Home page</a>
</body>
</html>