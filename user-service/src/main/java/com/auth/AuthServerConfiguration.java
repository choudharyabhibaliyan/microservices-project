package com.auth;

import jdk.nashorn.internal.ir.CallNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AuthServerConfiguration  {
//https://youtu.be/DaUGKnA7aro  youtube leacture for Authorization server
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       return http.formLogin().and().authorizeRequests().anyRequest().authenticated().and().build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager inmemoryUserDetails = new InMemoryUserDetailsManager();
        inmemoryUserDetails.createUser(User.withUsername("abhi").password("123").authorities("read").build());
        return inmemoryUserDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }


}
