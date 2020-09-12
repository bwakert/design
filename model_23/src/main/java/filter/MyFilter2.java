//package filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
//@WebFilter(filterName = "myFilter2",urlPatterns = "/test1")
//public class MyFilter2 implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("second filter 1");
//        System.out.println("before:" + response);
//        filterChain.doFilter(request, response);
//        System.out.println("after:" + response);
//        System.out.println("second filter 2");
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
