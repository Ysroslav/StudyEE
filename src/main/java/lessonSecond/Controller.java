package lessonSecond;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Controller", urlPatterns = {"/","/main","/product","/card","/order"})
public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            response.setContentType("text/html; charset=UTF-8");
            String url = "WEB-INF/";
            if(request.getServletPath().equals("/")|| request.getServletPath().equals("/main")){
                url +="index.jsp";
            } else if(request.getServletPath().equals("/product")){
                url +="product.jsp";
            } else if(request.getServletPath().equals("/card")){
                url +="card.jsp";
            } else if(request.getServletPath().equals("/order")){
                url +="order.jsp";
            }
            request.getRequestDispatcher(url).forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
