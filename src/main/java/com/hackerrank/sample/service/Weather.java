package com.hackerrank.sample.service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="weather")
    public class Weather implements Serializable {
        private static final long serialVersionUID = 3780748293761465843L;

    public Weather() {
    }

    public Weather(String city, Long date, String temperature, long modificationTs) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.modificationTs = modificationTs;
    }



        @Id
        @Column(name="id")
        @GeneratedValue(strategy = GenerationType.AUTO)

        private Long id;

        @Column(name="city")
        private String city;

        @Column(name="date")
        private Long date;

        @Column(name="temperature")
        private String temperature;

        @Column(name="modification_ts")
        private long modificationTs;


}
