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


public void feeding(String Animal, String Food){
    System.out.println(getName() +" is giving some "+ Food + " food " + " to " + Animal);
}

public void playing(String Animal, String Activity){
    System.out.println(getName() + " is playing " + Activity + " with " + Animal);
}
}






