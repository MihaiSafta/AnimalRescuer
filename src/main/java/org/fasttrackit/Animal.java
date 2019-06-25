package org.fasttrackit;

public class Animal {
 private String name;
 private int age;
 private int healthlevel;
 private int foodlevel;
 private int happyness;
 private String favouritefood;
 private String favouritesport;
 private String color;
 private String furrtype;
 private String temper;
 private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthlevel() {
        return healthlevel;
    }

    public void setHealthlevel(int healthlevel) {
        this.healthlevel = healthlevel;
    }

    public int getFoodlevel() {
        return foodlevel;
    }

    public void setFoodlevel(int foodlevel) {
        this.foodlevel = foodlevel;
    }

    public int getHappyness() {
        return happyness;
    }

    public void setHappyness(int happyness) {
        this.happyness = happyness;
    }

    public String getFavouritefood() {
        return favouritefood;
    }

    public void setFavouritefood(String favouritefood) {
        this.favouritefood = favouritefood;
    }

    public String getFavouritesport() {
        return favouritesport;
    }

    public void setFavouritesport(String favouritesport) {
        this.favouritesport = favouritesport;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurrtype() {
        return furrtype;
    }

    public void setFurrtype(String furrtype) {
        this.furrtype = furrtype;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
