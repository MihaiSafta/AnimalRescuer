package org.fasttrackit;

public class Vet extends Person{
    private String specialization;
    private double experience;
    private double charge;
    private String animalsHeLikes;

    public Vet(int age, String name) {
        super(age, name);
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public String getAnimalsHeLikes() {
        return animalsHeLikes;
    }

    public void setAnimalsHeLikes(String animalsHeLikes) {
        this.animalsHeLikes = animalsHeLikes;
    }




}
