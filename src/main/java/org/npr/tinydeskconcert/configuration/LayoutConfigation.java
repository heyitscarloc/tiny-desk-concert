package org.npr.tinydeskconcert.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
public class LayoutConfigation {
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
