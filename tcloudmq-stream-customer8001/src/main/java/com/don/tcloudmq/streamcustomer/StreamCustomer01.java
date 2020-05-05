package com.don.tcloudmq.streamcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamCustomer01 {
    public static void main(String[] args)
    {
        SpringApplication.run(StreamCustomer01.class, args);
    }

}
