package com.springboot.controller;

import com.springboot.service.IntegrationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/integration")
@RestController
public class IntegrationController {

    @Autowired
    private IntegrationGateway integrationGateway;

    @GetMapping(value = "{name}")
    public String getMessageFromServcie(@PathVariable("name") String name) {
        return integrationGateway.sendMessage(name);
    }
}
