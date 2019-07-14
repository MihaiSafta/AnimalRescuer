package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String adopter;
    private String dog;
    private String vet;
    private int gamenumber;

    private List<Food> availebleFood = new ArrayList<>();
    private Activity[] availebleActivities = new Activity[3];


    private void initFood() {
        Food food1 = new Food("Meatball", 40, 1);
        Food food2 = new Food("LeafyMeat", 5, 2.5);
        availebleFood.add(food1);
        availebleFood.add(food2);
        availebleFood.add(new Food("MonsterMeat", 100, 90));
    }

    private void printFood() {
        System.out.print("Available food is: ");
        for(Food food : availebleFood){
            System.out.print(food.getName() + " ");
        }
        System.out.println();
//        for (int i = 0; i < availebleFood.size(); i++) {
//            System.out.print(availebleFood.get(i).getName() + " ");
//        }
//        System.out.println();
    }

    private void printActivities() {

        System.out.print("Available activities are: ");
//        for(Activity activity : availebleActivities){
//            System.out.print(activity.getName() + " ");
//        }
//        System.out.println();
        try {
            for (int i = 0; i < availebleActivities.length; i++) {
                System.out.print(availebleActivities[i].getName() + " ");
            }
        } catch (NullPointerException e){

        }
        System.out.println();
    }


    public void start() {

        initActivities();
        initFood();
        printFood();
        printActivities();
    }

    private void initActivities() {
        Activity activity1 = new Activity("running", "in the park", 6);
        Activity activity2 = new Activity("jumping", "in the park", 2);
        availebleActivities[0] = activity1;
        availebleActivities[1] = activity2;

    }

    public void listAvailebleFood() {

    }

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
