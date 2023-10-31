package com.bnta.taskLab_01.models;

public class Greeting {

    private String name;
    private int timeOfDay;

    public Greeting(String Word){
        this.name = name;
        this.timeOfDay = 0;
    }

    public Greeting(String name, int timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(int timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
