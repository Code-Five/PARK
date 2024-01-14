package com.ng.edu.binghamuni.park.Repository;

import com.ng.edu.binghamuni.park.Domain.CustomerInformation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
         CustomerInformation James = new CustomerInformation(
                 1L,
                 "James Vardy",
                 "Bingham University",
                 "09292992922",
                 "Kelvin@gmail.com",
                 "Bmw",
                 "Mssms",
                 "red",
                 "Newspaper"

         );


         repository.saveAll(List.of(James));
        };

    }

}
