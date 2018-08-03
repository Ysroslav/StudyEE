package lessonFirst;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "CatalogFilter", urlPatterns = {"/lessonFirst.Catalog"})
public class CatalogFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain){
        response.setContentType("text/html;charset = UTF-8");
    }

    public void destroy(){}
}
