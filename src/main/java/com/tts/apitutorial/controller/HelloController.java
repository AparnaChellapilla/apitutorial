package com.tts.apitutorial.controller;

import com.tts.apitutorial.model.Engine;
import com.tts.apitutorial.repository.EngineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String personalGreeting(@RequestParam( defaultValue = "World") String name) {
        return "Hello " + name;
    }

}