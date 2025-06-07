
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;

@WebServlet("/DeliveryManagerServlet")
public class DeliveryManagerServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.getWriter().println("DeliveryManagerServlet logic here.");
  }
}
