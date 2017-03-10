<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">  
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

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Employees</title>
</head>
<body>
<div>
<h4>${msg }</h4>
<h5>All Employees</h5>
   <table>
   <tr><th> Employee ID  </th>
   <th>Employee Name</th>
      <th>Employee Salary</th>
         <th>Employee Designation</th>
   </tr>
    <c:forEach items="${list}" var="employee">
  <tr>
        <td><c:out value="${employee.id}"/></td>
        <td> <c:out value="${employee.name}"/></td>
        <td> <c:out value="${employee.salary}"/></td>  
        <td> <c:out value="${employee.designation}"/></td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>
