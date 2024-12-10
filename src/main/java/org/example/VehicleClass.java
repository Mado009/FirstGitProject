package org.example;

import java.util.ArrayList;

class Vehicle{
    private String number;
    private String type;
    private String color;
    private String model;

    public Vehicle() {

    }

    public Vehicle(String number, String type, String color, String model) {
        this.number = number;
        this.type = type;
        this.color = color;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}