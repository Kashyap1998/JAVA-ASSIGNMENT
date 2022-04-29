package servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import constants.IOnlineBookStoreConstants;
import sql.IUserContants;


@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		String uName = req.getParameter("username");
		String pWord = req.getParameter("password");
		String fName = req.getParameter("firstname");
		String lName = req.getParameter("lastname");
		String addr = req.getParameter("address");
		String phNo = req.getParameter("phone");
		String mailId = req.getParameter("mailid");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/onlinebookstore";
            Connection connection= DriverManager.getConnection(url,"root","Krish@123");
            String sql="insert into users (username, password,firstname,lastname,address,phone,mailid) values (?,?,?,?,?,?,?)";
            PreparedStatement ps=connection.prepareStatement(sql);
			
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ps.setString(3, fName);
			ps.setString(4, lName);
			ps.setString(5, addr);
			ps.setString(6, phNo);
			ps.setString(7, mailId);
			
			int k = ps.executeUpdate();
			if (k == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("sample.html");
				rd.forward(req, res);
				pw.println("<h3 class='tab'>User Registered Successfully</h3>");
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, res);
				pw.println("Sorry for interruption! Register again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}


