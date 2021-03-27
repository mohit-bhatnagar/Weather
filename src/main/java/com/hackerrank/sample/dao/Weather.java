package com.hackerrank.sample.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weather")
    public class Weather implements Serializable {
        private static final long serialVersionUID = 3780748293761465843L;

        @Id
        @Column(name="id")
        private String id;

        @Column(name="city")
        private String city;

        @Column(name="date")
        private Long date;

        @Column(name="temperature")
        private String temperature;

        @Column(name="modification_ts")
        private long modificationTs;



    }
