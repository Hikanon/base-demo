package ru.base.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.base.database.configuration.ConverterConfiguration;
import ru.base.database.configuration.RepositoryConfiguration;

@SpringBootApplication
@Import({RepositoryConfiguration.class, ConverterConfiguration.class})
public class DatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

}
