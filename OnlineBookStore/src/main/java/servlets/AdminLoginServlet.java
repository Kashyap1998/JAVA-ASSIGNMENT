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
import javax.servlet.http.Cookie;
import javax.xml.transform.Result;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName = req.getParameter("username");
		String pWord = req.getParameter("password");
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/onlinebookstore";
            Connection connection=DriverManager.getConnection(url,"root","Krish@123");
            String sql="SELECT* FROM  users WHERE username=? AND password=?";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("sample.html");
				
				Cookie ck = new Cookie("usertype","admin");
				
				rd.include(req, res);
				pw.println("<div class=\"tab\">Admin login Successful</div>");
				pw.println("<div class=\"tab\"><br/><a href=\"AddBook.html\">ADD BOOKS</a><br/></div>");
				pw.println("<div class=\"tab\"><br/><a href=\"RemoveBooks.html\">REMOVE BOOKS</a><br/></div>");
				pw.println("<div class=\"tab\"><br/><a href=\"ViewBooks.html\">VIEW BOOKS</a><br/></div>");
				pw.println("<div class=\"tab\"><br/><a href=\"UpdateBook.html\">UPDATE BOOKS</a><br/></div>");
			} else {

				RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.html");
				rd.include(req, res);
				pw.println("<div class=\"tab\">Incorrect UserName or PassWord</div>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

