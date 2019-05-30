package com.stackroute.MuzixMongoDb;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = TracksRepo.class)
@Configuration
public class TracksDb {
    @Bean
    CommandLineRunner commandLineRunner(TracksRepo data)
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception
            {
                data.save(new Tracks(1,"Song1","Singer1","Melody tpe"));
                data.save(new Tracks(2,"Song2","Singer2","Classical song"));
                data.save(new Tracks(3,"Song3","Singer3","Pop song"));
                data.save(new Tracks(4,"Song4","Singer4","Rock song"));
            }
        };
    }
}
