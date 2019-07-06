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
        animal.setFoodlevel(animal.getFoodlevel() - 1);
        if(animal.getFavouritefood().equals(food.getName())){
            animal.setHappyness(animal.getHappyness() + 1 );
            System.out.println("Happiness level received bonus +1, it is now: " + animal.getHappyness());
        }
        System.out.println("Food level after feeding is: " + animal.getFoodlevel());
    }


    public void playing(Animal animal, Activity activity) {
        System.out.println(getName() + " is playing " + activity.getName() + " with " + animal.getName());

        if(animal.getFavouritesport().equals(activity.getName())){
            animal.setHappyness(animal.getHappyness() + 2);
            System.out.println("Bonus +2 for favourite activity!");
        }else {
        animal.setHappyness(animal.getHappyness() + 1);}
        System.out.println(" Happiness lvl is now : " + animal.getHappyness());
    }
}







