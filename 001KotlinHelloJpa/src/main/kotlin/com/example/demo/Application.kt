package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter
import java.util.Arrays
import java.util.Collections
import java.util.stream.Collectors

@SpringBootApplication
//@CrossOrigin

open class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

/*@Bean
    public fun  corsFilter():CorsFilter {
        var source:UrlBasedCorsConfigurationSource= UrlBasedCorsConfigurationSource();
        var config:CorsConfiguration= CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Collections.singletonList("*"));
        config.setAllowedHeaders(Collections.singletonList("*"));
        config.setAllowedMethods<HttpMethod>(Arrays.stream(HttpMethod.values()).map(HttpMethod::name).collect(Collectors.toList()));
        source.registerCorsConfiguration("/**", config);
        return CorsFilter(source);
    }*/