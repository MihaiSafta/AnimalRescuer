package org.fasttrackit;

public class Adopterwife extends Person{
    private String animalsSheLikes;
    private String animalsSheDoesNotLike;
    private int previuousPets;

    public String getAnimalsSheLikes() {
        return animalsSheLikes;
    }

    public void setAnimalsSheLikes(String animalsSheLikes) {
        this.animalsSheLikes = animalsSheLikes;
    }

    public String getAnimalsSheDoesNotLike() {
        return animalsSheDoesNotLike;
    }

    public void setAnimalsSheDoesNotLike(String animalsSheDoesNotLike) {
        this.animalsSheDoesNotLike = animalsSheDoesNotLike;
    }

    public int getPreviuousPets() {
        return previuousPets;
    }

    public void setPreviuousPets(int previuousPets) {
        this.previuousPets = previuousPets;
    }

    public Adopterwife(int age, String name) {
        super(age, name);
    }
}
