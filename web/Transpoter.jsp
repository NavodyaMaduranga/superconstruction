<%-- 
    Document   : Transpoter
    Created on : Oct 21, 2018, 12:35:40 PM
    Author     : Singer
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Services.GetTranspoterDetails"%>
<%@page import="Services.GetAccountDetails"%>
<%@page import="Services.SetDashboarddata"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transpoter Dashboard</title>
    </head>
    <link rel="stylesheet" type="text/css" href="Transpoter.css">
    <body>
        
        <%@include file="Header.jsp" %>
        
        <%
            String UserName = (String) session.getAttribute("UserName");
            session.setAttribute("UMessage", "No");
            
            SetDashboarddata sd = new SetDashboarddata();
            GetAccountDetails gad = new GetAccountDetails();
            GetTranspoterDetails gtd = new GetTranspoterDetails();
            
            String url = "Poto\\" + sd.getData(UserName).toString();
            gtd.SetDetails(UserName);
            gad.SetDetails(UserName);
            String Name = gad.getName();
            String VehicleNumber = gtd.getVehicleNumber();
            String Model = gtd.getModel();
            String Charge = gtd.getCharge();
        %>
        
        <div id="Side1"></div>
        <div id="Div1">
            <br>
            <center><img src="<%=url%>" width="230" height="300"/></center>
            <center><p>
                <h3><%=Name%></h3>
            </p></center>
            <center><a href="UpdateDetails.jsp">Update Details</a></center>
        </div>
        <div id="Side1"></div>
        
        <%
            String UMessage = (String) session.getAttribute("UDMessage");
            if(!UMessage.equals(null) || !UMessage.equals("")){
                session.setAttribute("UDMessage", "");
        %>
        
        <div id="topicS"></div>
        <div id="topicD">
            <center><h4><%=UMessage%></h4></center>
        </div>
        <div id="topicS"></div>
        
        <%
            }
        %>
        
        <div id="Side2"></div>
        <div id="Div2">
            <table class="table" align="center" border="0">
                <tbody>
                    <tr>
                        <td><b>Vehicle Number :</b></td>
                        <td><b><%=VehicleNumber%></b></td>
                    </tr>
                    <tr>
                        <td><b>Model :</b></td>
                        <td><b><%=Model%></b></td>
                    </tr>
                    <tr>
                        <td><b>Charge per 1Km :</b></td>
                        <td><b><%=Charge%></b></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div id="Side2"></div>
        
        <div id="topicS"></div>
        <div id="topicD">
            <center><p>Feedbacks</p></center>
        </div>
        <div id="topicS"></div>
        
        <%    
            String temp1 ="";
            String temp2 = "";
            
            Connection con;
            Statement st;
            String path = "jdbc:mysql://localhost:3306/constructiondatabase";
        
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(path,"root","");
            st =  con.createStatement();
                    
            PreparedStatement pst;
            pst = con.prepareStatement("SELECT userdetails.first_name, "
                    + "userdetails.last_name, feedback.details FROM "
                    + "userdetails INNER JOIN feedback ON "
                    + "feedback.customer_name = userdetails.user_name "
                    + "WHERE feedback.user_name=?");
            pst.setString(1, UserName);
            
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                temp1 = rs.getString(1) + " " + rs.getString(2);
                temp2 = rs.getString(3);
        %>
        
        <div id="Side2"></div>
        <div id="Div2">
            <table class="table" align="center" border="0">
                <tbody>
                    <tr>
                        <td><b><%=temp1%> :</b></td>
                        <td><b><%=temp2%></b></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div id="Side2"></div>
        
        <%
            }
        %>
                
    </body>
</html>
