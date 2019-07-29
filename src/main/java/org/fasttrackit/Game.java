package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Food> availebleFood = new ArrayList<>();
    private Activity[] availebleActivities = new Activity[3];

    private Adopter adopter;
    private Animal animal;


    private void initFood() {
        Food food1 = new Food("Meatball", 40, 1);
        Food food2 = new Food("LeafyMeat", 5, 2.5);
        availebleFood.add(food1);
        availebleFood.add(food2);
        availebleFood.add(new Food("MonsterMeat", 100, 90));
    }

    private void printFood() {
        System.out.print("Available food is: ");
        for (Food food : availebleFood) {
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
        } catch (NullPointerException e) {

        }
        System.out.println();
    }

    private void initAnimal() {
        System.out.println("Welcome! Please select your animal! Available animals are cat and dog.");
        System.out.println("Selected animal is:");
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();
        animal = new Animal();
    }

    private void initAdopter() {
        System.out.println("Pease enter adopter name:");
        Scanner scanner = new Scanner(System.in);
        String adopterName = scanner.nextLine();
        System.out.println("Please enter adopter age:");
        int adopterAge = scanner.nextInt();
        adopter = new Adopter(adopterAge, adopterName);
        System.out.println("Adopter is:" + adopter.getName() + ", and has " + " " + adopter.getAge() + "years");
    }


    private void nameAnimal() {
        System.out.println("Please select animal name");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        animal.setName(animalName);
        System.out.println("Animal name is: " + animal.getName());
    }


    public void start() {

        initAnimal();
        initAdopter();
        nameAnimal();
    }

    private void initActivities() {
        Activity activity1 = new Activity("running", "in the park", 6);
        Activity activity2 = new Activity("jumping", "in the park", 2);
        availebleActivities[0] = activity1;
        availebleActivities[1] = activity2;

    }

    public void listAvailebleFood() {

    }
}




