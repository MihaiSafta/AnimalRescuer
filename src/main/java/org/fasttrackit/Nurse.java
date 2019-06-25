package org.fasttrackit;

public class Nurse extends Person {

    private double experience;

    public Nurse(int age, String name) {
        super(age, name);
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
