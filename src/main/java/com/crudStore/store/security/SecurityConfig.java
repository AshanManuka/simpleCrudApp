package com.crudStore.store.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;
import java.beans.Customizer;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSources){
        return new JdbcUserDetailsManager(dataSources);
    }


//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeHttpRequests(configurer ->
//                configurer
//                        .requestMatchers(HttpMethod.GET, "/api/customers").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.GET, "/api/customers/**").hasRole("EMPLOYEE")
//                        .requestMatchers(HttpMethod.POST, "/api/customers").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.PUT, "/api/customers").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.DELETE, "/api/customers").hasRole("ADMIN")
//                );
//        httpSecurity.httpBasic(Customizer.withDefaults());
//
//        httpSecurity.csrf(csrf -> csrf.disable());
//        return httpSecurity.build();
//    }

}
