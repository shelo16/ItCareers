package com.tornikeshelia.itcareers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ItCareersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItCareersApplication.class, args);
    }

}
