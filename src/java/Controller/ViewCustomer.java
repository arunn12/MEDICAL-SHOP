package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
public class ViewCustomer extends HttpServlet 
{
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
{
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter())
{
String lat= request.getParameter("latitude");
String longi= request.getParameter("longitude");
try
{
ArrayList<String>al= new Customer().getPharmacy(lat, longi);
HttpSession ss = request.getSession();
ss.setAttribute("result", al);
response.sendRedirect("ViewCustomer.jsp");
}
catch (Exception e)
{
e.printStackTrace();
}
}
}
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
{
processRequest(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
processRequest(request, response);
}
@Override
public String getServletInfo() 
{
return "Short description";
}
}