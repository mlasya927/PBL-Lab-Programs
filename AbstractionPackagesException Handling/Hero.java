package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = 0;
    }

    @Override
    public String getModelName() { return modelName; }

    @Override
    public String getRegistrationNumber() { return registrationNumber; }

    @Override
    public String getOwnerName() { return ownerName; }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Radio device is now playing.");
    }

    public static void main(String[] args) {
        Hero hero = new Hero("Splendor", "AP16AB1234", "Naga Lakshmi");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
    }
}
