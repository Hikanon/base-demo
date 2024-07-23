package ru.base.gateway.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.base.common.converter")
public class ConverterConfiguration {

}
