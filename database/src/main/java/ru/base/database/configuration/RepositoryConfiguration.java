package ru.base.database.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "ru.base.database.repository")
@EntityScan(basePackages = "ru.base.common.model.entity")
public class RepositoryConfiguration {

}
