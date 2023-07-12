package com.crudStore.store.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.beans.Customizer;

@Configuration
public class SecurityConfig {


//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpMM) throws Exception {
//        httpMM.authorizeHttpRequests(configurer ->
//                configurer
//                        .requestMatchers(HttpMethod.GET, "/api/customers").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.GET, "/api/customers/**").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.POST, "/api/customers").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.PUT, "/api/customers").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.DELETE, "/api/customers").hasRole("ADMIN")
//                );
//        httpMM.httpBasic(Customizer.withDefaults());
//
//        httpMM.csrf(csrf -> csrf.disable());
//        return httpMM.build();
//    }
}
