package com.javatutorials.Springboot.filter;


import jakarta.servlet.*;
import org.springframework.stereotype.Component;


import java.io.IOException;
@Component
public class MyNewfilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("The new filter is called ...");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
