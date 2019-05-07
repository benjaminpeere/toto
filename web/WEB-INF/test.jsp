<%--
  Created by IntelliJ IDEA.
  User: Utilisateur
  Date: 18/04/2019
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<p>Page généré avec jsp</p>

<%
    String attribut = (String) request.getAttribute("test");
    out.println(attribut);
%>
</body>
</html>
