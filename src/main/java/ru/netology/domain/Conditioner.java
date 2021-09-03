package ru.netology.domain;


public class Conditioner {
    private int id;
    private String name = "Vedro";
    private int currentTemperature = 100;
    private int maxTemperature = 50;
    private int minTemperature = 30;
    private boolean of;

    public Conditioner(int id, String name, int currentTemperature, int maxTemperature, int minTemperature, boolean of) {
        this.id = id;
        this.name = name;
        this.currentTemperature = currentTemperature;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.of = of;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}