<%-- 
    Document   : data
    Created on : Jun 10, 2018, 9:11:17 PM
    Author     : cadav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data Information</title>
    </head>
    <body>
        <h1>Data Information</h1>
        <form action="./EWUServlet" method="POST" onsubmit="alert('Thank you for your feedback.');">
            <table border="1">
                <tbody>
                    
                    <tr>
                        <td>Your ID</td>
                        <td><input type="text" name="id" value="${data.id}"/></td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="firstName" value="${data.firstName}"/></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lastName" value="${data.lastName}"/></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="${data.email}"/></td>
                    </tr>
                    <tr>
                        <td>Report</td>
                        <td><input type="text" name="report" value="${data.report}"/></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                        <input type="submit" name="action" value="Add"/>
                        <input type="submit" name="action" value="Edit"/>
                        <input type="submit" name="action" value="Delete"/>
                        <input type="submit" name="action" value="Search"/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
        <br>
            <table border="1">
                <th>User Id</th>
                <th>ID Number</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Report</th>
                
                <c:forEach items="${allData}" var="dat">
                    <tr>
                        <td>${data.userId}</td>
                        <td>${data.id}</td>
                        <td>${data.firstName}</td>
                        <td>${data.lastName}</td>
                        <td>${data.email}</td>
                        <td>${data.report}</td>
                    </tr>
                </c:forEach>
           </table>
    </body>
</html>
