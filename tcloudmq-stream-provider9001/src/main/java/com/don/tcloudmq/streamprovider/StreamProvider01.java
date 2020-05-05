package com.don.tcloudmq.streamprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamProvider01 {
    public static void main(String[] args)
    {
        SpringApplication.run(StreamProvider01.class, args);
    }
}
