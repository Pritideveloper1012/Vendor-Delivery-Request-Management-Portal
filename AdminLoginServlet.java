
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.getWriter().println("AdminLoginServlet logic here.");
  }
}
