package com.hackerrank.sample.controller;

import com.hackerrank.sample.dao.Weather;
import com.hackerrank.sample.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/weather")
public class SampleController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(value = "/select", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getWeather() {
        return ResponseEntity.ok().body(weatherService.findAll());

    }

    @GetMapping(value = "/select/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getWeatherById(@PathVariable String id) {

        return ResponseEntity.ok().body(weatherService.findById(id));

    }

    @PostMapping(value = "/insert")
    public ResponseEntity<?> addWeather(@RequestBody Weather weather) {
        return ResponseEntity.ok().body(weatherService.insert(weather));

    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id) {
        weatherService.deleteById(id);
        return ResponseEntity.ok().body(id);

    }

}
