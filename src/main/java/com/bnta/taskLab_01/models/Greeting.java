package com.bnta.taskLab_01.models;

import java.time.LocalTime;

public class Greeting {

    private String name;
    private LocalTime timeOfDay;


    public Greeting(String name) {
        this.name = name;
        this.timeOfDay = LocalTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
