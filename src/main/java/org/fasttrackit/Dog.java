package org.fasttrackit;

public class Dog extends Animal{

    public Dog(String name, int age, int healthlevel, int foodlevel, int happyness, String favouritefood, String favouritesport, String color, String furrtype, String temper, double weight) {
        super(name, age, healthlevel, foodlevel, happyness, favouritefood, favouritesport, color, furrtype, temper, weight);
    }

    @Override
    public void goodcheer() {
        super.goodcheer();
        System.out.println("Dog is wiggling his tail ");
    }
}
