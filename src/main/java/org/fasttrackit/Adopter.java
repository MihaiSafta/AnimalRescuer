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
        animal.setFoodlevel(animal.getFoodlevel() + 2);
        if (animal.getFavouritefood().equals(food.getName())) {
            animal.setHappyness(animal.getHappyness() + 1);
            System.out.println("Happiness level received bonus +1, it is now: " + animal.getHappyness());
        }
        if (food.getName().contains("none")) {
            animal.setFoodlevel(animal.getFoodlevel() - 5);
            System.out.println("You did not feed your animal!" + " Food lvl " + "is now " + animal.getFoodlevel());
        }
        System.out.println("Food level after feeding is: " + animal.getFoodlevel() + " hitpoints = " + animal.getHealthlevel());
    }


    public void playing(Animal animal, Activity activity) {
        System.out.println(getName() + " is playing " + activity.getName() + " with " + animal.getName());

        if (animal.getFavouritesport().equals(activity.getName())) {
            animal.setHappyness(animal.getHappyness() + 2);
            animal.setFoodlevel(animal.getFoodlevel() - 1);
            animal.setHealthlevel(animal.getHealthlevel() + 1);
            System.out.println("Bonus +2 for favourite activity!");
        } else {
            animal.setHappyness(animal.getHappyness() + 1);
            animal.setFoodlevel(animal.getFoodlevel() - 1);
            animal.setHealthlevel(animal.getHealthlevel() + 1);
        }
        if (activity.getName().contains("none")) {
            animal.setHealthlevel(animal.getHealthlevel() - 5);
            System.out.println("You did not play with your animal!" + "Health level decresed by : " + animal.getHealthlevel());
        }
        System.out.println(" Happiness lvl is now : " + animal.getHappyness() +" and "+ "food lvl is: " + animal.getFoodlevel() + " hitpoints = " + animal.getHealthlevel());
    }
}







