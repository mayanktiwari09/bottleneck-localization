package com.proxy.controller;

import com.proxy.service.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proxy/")
public class ProxyController {

    @Autowired
    private Proxy proxyService;

    @GetMapping("/fib/{number}")
    public Long fib(@PathVariable int number){
        return this.proxyService.findFib(number);
    }

    @GetMapping("/fact/{number}")
    public Long fact(@PathVariable int number){
        return this.proxyService.findFact(number);
    }

}