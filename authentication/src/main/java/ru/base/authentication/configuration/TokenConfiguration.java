package ru.base.authentication.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "token")
@Data
public class TokenConfiguration {

    private String seed;
    private Long tokenValidity;

}
