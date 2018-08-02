package com.example.credhub;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredhubValueController {

    private CredhubProperties credhubProperties;

    public CredhubValueController(CredhubProperties credhubProperties) {
        this.credhubProperties = credhubProperties;
    }

    @GetMapping("/")
    public String getCredhubValue() {
        return credhubProperties.mysecretkey;
    }
}
