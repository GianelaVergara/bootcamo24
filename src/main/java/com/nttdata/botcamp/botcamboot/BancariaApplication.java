package com.nttdata.botcamp.botcamboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class BancariaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BancariaApplication.class, args);
    }
}
