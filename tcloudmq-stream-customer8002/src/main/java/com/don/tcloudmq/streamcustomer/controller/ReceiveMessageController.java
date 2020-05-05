package com.don.tcloudmq.streamcustomer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Sink.class)
public class ReceiveMessageController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void receiveMessage(Message<String> message)
    {
        System.out.println(message.getPayload() + " port: " + serverPort);
    }

    @GetMapping("/zipkin-test")
    public String zipkinTest()
    {
        return "zipkin test, port: " + serverPort;
    }

}
