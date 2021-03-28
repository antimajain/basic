package com.example.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/1")
    public String getTodo( String id)  {
        return "Hello Antima from tmp1";
    }
    @GetMapping("/2")
    public String getTodo2( String id)  {
        return "Hello Antima from tmp 2";
    }
}
