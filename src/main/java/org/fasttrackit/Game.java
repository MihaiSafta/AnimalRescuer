package org.fasttrackit;

public class Game {
   private String adopter;
   private String dog;
   private String vet;
   private int gamenumber;

    public Game(String adopter, String dog, String vet, int gamenumber) {
        this.adopter = adopter;
        this.dog = dog;
        this.vet = vet;
        this.gamenumber = gamenumber;
    }

    public String getAdopter() {
        return adopter;
    }

    public void setAdopter(String adopter) {
        this.adopter = adopter;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getVet() {
        return vet;
    }

    public void setVet(String vet) {
        this.vet = vet;
    }

    public int getGamenumber() {
        return gamenumber;
    }

    public void setGamenumber(int gamenumber) {
        this.gamenumber = gamenumber;
    }
}
