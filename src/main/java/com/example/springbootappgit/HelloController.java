package com.example.springbootappgit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CHAVANITS KC
 */
@RestController
public class HelloController {

    @GetMapping("/first-method")
    public String firstMethod(){
        return "Hello, First Method";
    }
}
