package com.integration.and.junit.tests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/testController")
    Integer test(@RequestParam int test ) {

        int value1 =1;
        int value2 =2;

        return test > 0 ? value1 : value2 ;
    }

}
