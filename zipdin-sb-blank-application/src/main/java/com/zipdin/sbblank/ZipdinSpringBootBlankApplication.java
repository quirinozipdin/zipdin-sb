package com.zipdin.sbblank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ZipdinSpringBootBlankApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ZipdinSpringBootBlankApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static final Class<ZipdinSpringBootBlankApplication> applicationClass = ZipdinSpringBootBlankApplication.class;

}
