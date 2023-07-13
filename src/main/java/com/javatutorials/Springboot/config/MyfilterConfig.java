package com.javatutorials.Springboot.config;

import com.javatutorials.Springboot.filter.MyNewfilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MyfilterConfig {
    @Bean
    public FilterRegistrationBean<MyNewfilter> registrationBean(){
        FilterRegistrationBean<MyNewfilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new MyNewfilter());
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;

    }

}
