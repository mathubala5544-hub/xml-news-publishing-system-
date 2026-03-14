package com.news;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {

String user = request.getParameter("username");
String pass = request.getParameter("password");

if(user.equals("admin") && pass.equals("admin"))
{
response.sendRedirect("dashboard.jsp");
}
else
{
response.getWriter().println("Login Failed");
}

}
}