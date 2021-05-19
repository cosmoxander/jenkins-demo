package com.cosmo.xander.springj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/demo")
    public String showDemo() {
        return "demo";
    }
}
