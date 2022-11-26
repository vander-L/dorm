package com.example.dorm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MySpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("student/index");
        registry.addViewController("/change").setViewName("student/change");
        registry.addViewController("/replace").setViewName("student/replace");
        registry.addViewController("/pay").setViewName("student/pay");
        registry.addViewController("/repair").setViewName("student/repair");

        registry.addViewController("/admin").setViewName("adminlogin");
        registry.addViewController("/admin/index").setViewName("admin/index");
        registry.addViewController("/admin/change").setViewName("admin/change");
        registry.addViewController("/admin/seek").setViewName("admin/seek");
        registry.addViewController("/admin/changdorm").setViewName("admin/changedorm");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
