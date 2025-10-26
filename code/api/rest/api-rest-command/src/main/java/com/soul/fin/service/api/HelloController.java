package com.soul.fin.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/hello")
public class HelloController {

    @GetMapping()
    public String ret() {
        return "qq coisa";
    }

    // mono
    // flux
    // GET, PUT, PATCH, POST, DELETE
    // call command bus to application modulo
}
