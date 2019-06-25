package org.fasttrackit;

public class Adopter extends Person {

   private int funds;
   private String preferedAnimal;
   private String preferedFurrType;
   private int otherPets;

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

    public Adopter(int age, String name) {
        super(age, name);
    }

    // public void FeedingMethod(  Animal animal, Food food){

       // System.out.println(adopter+ );


    }



