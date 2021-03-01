package com.tts.apitutorial.controller;

import com.tts.apitutorial.model.Engine;
import com.tts.apitutorial.repository.EngineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/engine")
@RestController
public class EngineController {

    private EngineRepository engineRepository;

    public EngineController(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    @PostMapping("/add")
    public Engine addEngine(com.tts.apitutorial.model.Engine engine) {
        return engineRepository.save(engine);
    }

    @GetMapping("/all")
    public List<Engine> getAllEngines() {
        return (List<Engine>)engineRepository.findAll();
    }

    @GetMapping("/{id}/")
    public Optional<Engine> getEngine(@PathVariable Long id) {
        return engineRepository.findById(id);
    }

    // dealerships/{dealershipId}/cars/{carId}



}
