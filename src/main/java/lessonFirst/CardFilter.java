package lessonFirst;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "CardFilter", urlPatterns = {"/lessonFirst.Card"})
public class CardFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException{
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain){
        response.setContentType("text/html;charset = UTF-8");
    }

    public void destroy(){}
}
