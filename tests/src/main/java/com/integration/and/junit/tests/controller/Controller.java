package com.integration.and.junit.tests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/testController")
    Integer test(@RequestParam int test ) {

        int value;

        if (test>0){
            value = 1;
        }
        else {
            value = 2;
        }
        return value;
    }

}
