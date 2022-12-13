package com.example.hazelcastspringboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HazelcastSpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(HazelcastSpringBootTutorialApplication.class, args);
    }

}
