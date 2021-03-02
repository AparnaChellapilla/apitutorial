package com.tts.apitutorial.repository;

import com.tts.apitutorial.model.Engine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {

    Optional<Engine> findEngineByCylinderAndHorsepower(Integer cylinder, Integer horsepower);
}