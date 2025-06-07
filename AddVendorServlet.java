
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/AddVendorServlet")
public class AddVendorServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.getWriter().println("AddVendorServlet logic here.");
  }
}
