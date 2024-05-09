package com.max.celi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/test")
public class PruebaController {

    @GetMapping
    public String getAll() {return "all";}

    
    
    
}
