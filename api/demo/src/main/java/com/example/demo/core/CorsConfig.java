package com.example.demo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        // 允许前端 5173 端口访问（也可以用 "*" 允许所有，生产环境不建议）
        config.addAllowedOrigin("http://localhost:5173");
        // 允许携带 Cookie（如果需要）
        config.setAllowCredentials(true);
        // 允许所有请求方法（GET/POST/PUT/DELETE 等）
        config.addAllowedMethod("*");
        // 允许所有请求头
        config.addAllowedHeader("*");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 对所有接口生效
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
