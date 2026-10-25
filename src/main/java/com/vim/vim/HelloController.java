package com.vim.vim;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloFromJava()
    {
        System.out.println("This is hi message from console");
        return "<h2 style='color:red;font-family:sans-serif'>This is hello message from our spring boot application</h2>";
    }

    
}