package ru.base.backend.configuration;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    private final BackendConfiguration backendConfiguration;

    public FilterConfiguration(BackendConfiguration backendConfiguration) {
        this.backendConfiguration = backendConfiguration;
    }

    @Bean
    public FilterRegistrationBean<Filter> secretFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter((request, response, chain) -> {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;

            String secret = httpRequest.getHeader("Secret");
            if (secret == null || !secret.equals(backendConfiguration.getSecret())) {
                httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN, "Access denied");
                return;
            }
            chain.doFilter(request, response);
        });
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

}
