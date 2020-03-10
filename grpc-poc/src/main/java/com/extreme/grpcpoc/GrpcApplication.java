package com.extreme.grpcpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcApplication {

    public static void main(String[] args) {

        System.out.println("test");
        SpringApplication.run(GrpcApplication.class, args);
    }

}
