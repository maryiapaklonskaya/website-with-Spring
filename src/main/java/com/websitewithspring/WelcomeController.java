package com.websitewithspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/contact-us")
    public String getContactPage(){
        return "contact";
    }
}
