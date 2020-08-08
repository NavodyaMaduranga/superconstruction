<%-- 
    Document   : CreatedAccount
    Created on : Oct 15, 2018, 8:22:49 AM
    Author     : Singer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Created Account</title>
    </head>
    <link rel="stylesheet" type="text/css" href="CreatedAccount.css">
    <body>
        
        <div class="Top"></div>
            
        <div id="Side1"></div>
        <div id="Div1">
            
        <%
            String UserName = (String) session.getAttribute("UserName");
            String Type = (String) session.getAttribute("Type");
            String message = "You have successfully created your account " + UserName;
            
            session.setAttribute("UDMessage", "No");
        %>
        <center><h3>
            <%=message%>
            </h3></center>
        <%
            if(Type.equals("Customer")){
        %>
        <center><h4>
            For Login to your account press <a href="Dashboard.jsp">Enter</a> <%=UserName%>
        </h4></center>
        <%
            }else if(Type.equals("Developer")){
        %>
        <center><h4>
            For Login to your account press <a href="Developer.jsp">Enter</a> <%=UserName%>
        </h4></center>
        <%
            }else if(Type.equals("HardwareOwner")){
        %>
        <center><h4>
            For Login to your account press <a href="HardwareOwner.jsp">Enter</a> <%=UserName%>
        </h4></center>
        <%
            }else if(Type.equals("Transpoter")){
        %>
        <center><h4>
            For Login to your account press <a href="Transpoter.jsp">Enter</a> <%=UserName%>
        </h4></center>
        <%
            }
        %>
        
        </div>
        <div id="Side1">
    </body>
</html>
