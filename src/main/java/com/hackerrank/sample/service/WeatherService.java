package com.hackerrank.sample.service;

import com.hackerrank.sample.dao.Weather;
import com.hackerrank.sample.dao.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public Weather insert(Weather weather){
        return weatherRepository.save(weather);
    }

    public Optional<Weather> findById(String id){
        return weatherRepository.findById(id);
    }

    public List<Weather> findAll(){

        List<Weather> weatherList = new ArrayList<>();
        weatherRepository.findAll().forEach(weather->weatherList.add(weather));
        return weatherList;
    }

    public void deleteById(String id){
        weatherRepository.deleteById(id);
    }

}
