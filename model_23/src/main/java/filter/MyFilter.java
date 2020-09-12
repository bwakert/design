package filter;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "myFilter1",urlPatterns = "/*/ddd")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("first filter 1");
        filterChain.doFilter(request, response);
        System.out.println("first filter 2");
    }

    @Override
    public void destroy() {

    }
}
