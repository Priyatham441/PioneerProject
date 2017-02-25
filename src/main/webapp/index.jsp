
<!DOCTYPE html>
<html ng-app="PCSProject">
<head>
<meta charset="UTF-8">

<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
<script src="angular.js"></script>
<script src="MainApp.js"></script>

</head>
<body ng-controller="Btnfunction as Bt">
  
<div class="top-row" ng-hide="hideClassStatus">
  <p class="title">Login Page</p>
            <div >
              <label>
                First Name<span class="req">*</span>
              </label>
              <input type="text"  placeholder="FirstName" required/>
            </div>
        
            <div >
              <label>
                Password<span class="req">*</span>
              </label>
              <input type="password" placeholder="Password"/>
            </div>
            <button class="button-id" >Login</button>
<p><b> Not a member?? <a href="" ng-click="hideClasses()">Please Sign Up</b></a>
</div>

    
<div class="top-row" ng-show="hideClassStatus">
  <p class="title">Sign Up</p>
            <div >
              <label>
                First Name<span class="req">*</span>
              </label>
              <input type="text"  placeholder="FirstName"/>
            </div>
        
            <div >
              <label>
                Last Name<span class="req">*</span>
              </label>
              <input type="text" placeholder="LastName"/>
            </div>
            <div>
              <label>
                Email Address<span class="req">*</span>
              </label>
              <input type="text" placeholder="Email Address"/>
            </div>
            <div >
              <label>
                Phone Number<span class="req">*</span>
              </label>
              <input type="number" placeholder="Phone number"/>
            </div>
            <button class="button-id">Sign Up</button>
            <p><b> Already a member?? <a href="" ng-click="hideClasses()">Please Login</b></a>

</div>




</body>
</html>






<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">  
a.nounderline:link  
{  
 text-decoration:none;  
}  

div {
    height: 200px;
    width: 400px;
  

    position: fixed;
    top: 50%;
    left: 50%;
    margin-top: -100px;
    margin-left: -200px;
}  
</style>
</head>
<body>

<div>
<a href="./register" class="nounderline">Customer Registration</a></br>
<a href="./login" class="nounderline">Customer Login</a></br>
<a href="./emplist" class="nounderline">Get All Customer</a>
</div>

</body>
</html> --%>