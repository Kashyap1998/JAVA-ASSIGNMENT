package servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constants.IOnlineBookStoreConstants;
import practical.IUserContants;


@WebServlet("/UserLoginServlet")

public class UserLoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	
    	
    	PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		
		String uName=req.getParameter("username");
		String pWord=req.getParameter("password");
		
		
		
		try
		{
			
			 
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/onlinebookstore","root","Krish@123");
			
			 PreparedStatement ps=con.prepareStatement("SELECT * FROM users WHERE username= ? AND password = ?");
		
		     ps.setString(1,uName);
		     ps.setString(2,pWord);
		     
		     
		     
		      ResultSet rs=ps.executeQuery();
		     
		     if(rs.next())
		     {
		    	    RequestDispatcher rd=req.getRequestDispatcher("ViewBookServlet.java");
		    	    rd.forward(req, res);
					pw.print("<h2 style=color:green>Login Successful");
			 }
		    
		     else 
		     {
		    	 RequestDispatcher rd=req.getRequestDispatcher("UserLogin.html");
		    	 rd.include(req, res);
		    	 pw.print("Sorry wrong userid or password");
		     }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}
	


		

		
	


