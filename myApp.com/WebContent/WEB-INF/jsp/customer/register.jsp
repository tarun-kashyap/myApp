<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<title>Registration Page</title>
</head>
<body>

<form:form method="POST" commandName="user">
<table>
    <tr>
        <td><spring:message code="label.username" />:</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
        <td>Gender :</td>
        <td>
            <form:radiobutton path="gender" value="M" label="M" /> 
            <form:radiobutton path="gender" value="F" label="F" />
        </td>
    </tr>
    <tr>
        <td>Email :</td>
        <td>
            <form:input path="email"/>
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
        <form:checkbox path="mailingList" label="Would you like to join our mailinglist?" />
        </td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>

</body>
</html>