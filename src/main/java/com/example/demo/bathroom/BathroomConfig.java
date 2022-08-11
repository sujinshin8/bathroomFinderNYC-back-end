package com.example.demo.bathroom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class BathroomConfig {

    @Bean
    CommandLineRunner commandLineRunner(BathroomRepository repository) {
        return args -> {
            Bathroom bryantPark = new Bathroom(
                    "123 5th Ave",
                    "Bryant Park public bathroom",
                    LocalDate.of(2022, Month.AUGUST,1),
                    40.75353485643172,
                    -73.98335725979011,
                    0,
                    "public",
                    LocalDate.of(2022, Month.AUGUST,1)
            );

            Bathroom washPark = new Bathroom(
                    "123 west 4th st",
                    "Washington Park public bathroom",
                    LocalDate.of(2022, Month.AUGUST,1),
                    40.730894941244834,
                    -73.99732371184669,
                    0,
                    "public",
                    LocalDate.of(2022, Month.AUGUST,1)
            );

            Bathroom toLesJours = new Bathroom(
                    "123 32nd St",
                    "ktown private bathroom",
                    LocalDate.of(2022, Month.AUGUST,1),
                    40.74808857458619,
                    -73.9870192,
                    0,
                    "public",
                    LocalDate.of(2022, Month.AUGUST,1)
            );
            repository.saveAll(
                    List.of(bryantPark, washPark, toLesJours)
            );
        };
    }
}



