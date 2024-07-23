package ru.base.gateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(authorizeHttpRequests ->
                                                  authorizeHttpRequests
                                                          .requestMatchers("/backend/**").hasRole("USER")
                                                          .requestMatchers("/admin/**").hasRole("ADMIN")
        ).formLogin(formLogin ->
                            formLogin
                                    .loginPage("/auth/signIn")
                                    .failureUrl("/authentication/login?failed")
                                    .loginProcessingUrl("/api/auth/signIn")).build();
    }

}
