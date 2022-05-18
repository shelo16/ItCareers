package com.tornikeshelia.itcareers.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest() {
        return "Test";
    }

    @GetMapping("/")
    public HttpStatus healtcheck() {
        return HttpStatus.OK;
    }
}
