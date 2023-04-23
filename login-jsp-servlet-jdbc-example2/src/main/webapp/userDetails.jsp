<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
 <h1 style="text-align: center">User Data has been Successfully Saved!</h1>
 <%
String userEmpid = request.getAttribute("empid").toString();
 String userFirstName = request.getAttribute("firstname").toString();
 String userLastName = request.getAttribute("lastname").toString();
 String userContact = request.getAttribute("contact").toString();
 String userEmail = request.getAttribute("email").toString();
 String userAddress = request.getAttribute("address").toString();
 
 out.println(" <h2><br/> We got Your Data!!...Please verify the details</h2>"); 
 
  

 %>
 <form  method="get">
 <div>
 <table border="1" style="width: 90%; margin-left: auto; margin-right: auto; " class="table">
 <br/>
    
    <tr>
     <td><b>Empid</b></td>
     <td><%= userEmpid %></td>
    </tr>
    <tr>
     <td><b>FirstName</b></td>
     <td><%= userFirstName %></td>
    </tr>
    <tr>
     <td><b>LastName</b></td>
     <td><%= userLastName %></td>
    </tr>
    <tr>
     <td><b>Contact</b></td>
     <td><%= userContact %></td>
    </tr>
    <tr>
     <td><b>Email</b></td>
     <td><%= userEmail %></td>
    </tr>
    <tr>
     <td><b>Address</b></td>
     <td><%= userAddress %></td>
    </tr>
   </table>
   </div>
   </form>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<a href="employeeRegistartion.jsp">Back to Registration</a>
</body>
</html>