package org.fasttrackit;

public class Adopter extends Person {

    private int funds;
    private String preferedAnimal;
    private String preferedFurrType;
    private int otherPets;

    public Adopter(int age, String name) {
        super(age, name);
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public String getPreferedAnimal() {
        return preferedAnimal;
    }

    public void setPreferedAnimal(String preferedAnimal) {
        this.preferedAnimal = preferedAnimal;
    }

    public String getPreferedFurrType() {
        return preferedFurrType;
    }

    public void setPreferedFurrType(String preferedFurrType) {
        this.preferedFurrType = preferedFurrType;
    }

    public int getOtherPets() {
        return otherPets;
    }

    public void setOtherPets(int otherPets) {
        this.otherPets = otherPets;
    }

    public void feeding(Animal animal, Food food) {
        System.out.println(getName() + " is giving some " + food.getName() + " food " + " to " + animal.getName());
    }

    public void playing(Animal animal, Activity activity) {
        System.out.println(getName() + " is playing " + activity.getName() + " with " + animal.getName());
    }
}







