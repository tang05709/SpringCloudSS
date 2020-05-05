package com.don.tcloudmq.streamprovider.controller;

import com.don.tcloudmq.streamprovider.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider iMessageProvider;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/send-message")
    public String sendMessage()
    {
        return iMessageProvider.send();
    }

    @GetMapping("/zipkin-test")
    public String zipkinTest()
    {
        return "zipkin test, port: " + serverPort;
    }

}
