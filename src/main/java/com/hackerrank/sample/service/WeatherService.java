package com.hackerrank.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public Weather insert(Weather weather){
        return weatherRepository.save(weather);
    }

    public Weather findById(Long id){
        return weatherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Weatehr not found for this id :: " + id));

    }

    public List<Weather> findAll(){

        List<Weather> weatherList = new ArrayList<>();
        weatherRepository.findAll().forEach(weather->weatherList.add(weather));
        return weatherList;
    }

    public void deleteById(Long id){
        weatherRepository.deleteById(id);
    }

}
