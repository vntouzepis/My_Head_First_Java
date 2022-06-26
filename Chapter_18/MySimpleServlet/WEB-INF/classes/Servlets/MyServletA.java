package Servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class MyServletA extends HttpServlet{

    public void doGet (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
 String message="If you 're reading this, it worked!";
 out.println("<HTML><BODY>");   
  out.println("<H1>"+message+"</H1>");   
 out.println("</BODY></HTML>");   
out.close();
}

}