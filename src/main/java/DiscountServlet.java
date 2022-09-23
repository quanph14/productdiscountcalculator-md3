import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float discount = Float.parseFloat(request.getParameter("discount"));
        float price = Float.parseFloat(request.getParameter("price"));
        String product = String.copyValueOf(request.getParameter("product").toCharArray());
        float vnd = (float) (discount * price * 0.01);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount: " + discount + "</h1>");
        writer.println("<h1>Price: " + price + "</h1>");
        writer.println("<h1>VND: " + vnd + "</h1>");
        writer.println("<h1>Product Description: " + product + "</h1>");
        writer.println("</html>");
    }
}
