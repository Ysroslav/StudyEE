package lessonFirst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@WebServlet(name = "Product", urlPatterns = {"/lessonFirst.Product"})
public class Product extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response) throws IOException {
        //response.setContentType("text/html;charset = UTF-8");
        try{
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Product</title>");
            out.println("<ul>");
            out.println("<li><a href = 'MainPage'>HOME</a></li>");
            out.println("<li><a href = 'Catalog'>CATALOG</a></li>");
            out.println("<li><a href = 'Product'>PRODUCT</a></li>");
            out.println("<li><a href = 'Card'>CARD</a></li>");
            out.println("<li><a href = 'Order'>ORDER</a></li>");
            out.println("</ul>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Product</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (ServerException e){
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
