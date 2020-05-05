package com.don.tcloudmq.streamcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamCustomer02 {
    public static void main(String[] args)
    {
        SpringApplication.run(StreamCustomer02.class, args);
    }

}
