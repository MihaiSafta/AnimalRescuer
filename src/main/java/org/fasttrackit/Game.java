package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[3];

    private Adopter adopter;
    private Animal animal;
    private Food food;
    private Activity activity;


    private void initFood() {
        Food food1 = new Food("meatball", 40, 1);
        Food food2 = new Food("leafyMeat", 5, 2.5);
        availableFood.add(food1);
        availableFood.add(food2);
        availableFood.add(new Food("monsterMeat", 100, 90));
    }
    private void initActivities() {
        Activity activity1 = new Activity("running", "in the park", 6);
        Activity activity2 = new Activity("jumping", "in the park", 2);
        Activity activity3 = new Activity("sleeping", "bed",8);
        availableActivities[0] = activity1;
        availableActivities[1] = activity2;
        availableActivities[2] = activity3;
    }

    private void printFood() {
        System.out.print("Available food is: ");
        for (Food food : availableFood) {
            System.out.print(food.getName() + " ");
        }
        System.out.println();
//        for (int i = 0; i < availableFood.size(); i++) {
//            System.out.print(availableFood.get(i).getName() + " ");
//        }
//        System.out.println();
    }

    private void printActivities() {

        System.out.print("Available activities are: ");
//        for(Activity activity : availableActivities){
//            System.out.print(activity.getName() + " ");
//        }
 //    System.out.println();
        try {int size = availableActivities.length;
            for (int i = 0; i < size; i++) {
                System.out.print(availableActivities[i].getName() + " ");
            }
        } catch (NullPointerException e) {

        }
        System.out.println();
    }

    private void initAnimal() {
        animal = new Animal();

        System.out.println("Welcome! Please select your animal! Available animals are cat and dog.");
        System.out.println("Selected animal is:");
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();
        System.out.println("You have selected:" + animalType);
        animal.setHappyness(100);
        animal.setFoodlevel(100);
        animal.setHealthlevel(100);
    }

    private void initAdopter() {
        System.out.println("Please enter adopter name:");
        Scanner scanner = new Scanner(System.in);
        String adopterName = scanner.nextLine();
        System.out.println("Please enter adopter age:");
        int adopterAge = scanner.nextInt();
        adopter = new Adopter(adopterAge, adopterName);
        System.out.println("Adopter is:" + adopter.getName() + ", and has " + " " + adopter.getAge() + " years");
    }

    private void nameAnimal() {
        System.out.println("Please select animal name");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        animal.setName(animalName);
        System.out.println("Animal name is: " + animal.getName());
        System.out.println("Please select favourite food from the following: meatball, leafyMeat, monsterMeat or other.");
        animal.setFavouritefood(scanner.nextLine());
        System.out.println(animal.getName() + " likes " + animal.getFavouritefood());
        System.out.println("Please select favourite sport for your animal:");
        animal.setFavouritesport(scanner.nextLine());
        System.out.println(animal.getName() + " likes " + animal.getFavouritesport());
    }

    private void requireFeeding() {
        System.out.println("You can feed your animal:");
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.print(availableFood.get(i).getName() + " ");
        }
        food = new Food();
        System.out.println("Please select a food type:");
        Scanner scanner = new Scanner(System.in);
        String selectedFood = scanner.nextLine();
        food.setName(selectedFood);
        System.out.println("You have selected: " + food.getName());
        adopter.feeding(animal, food);
    }

    private void requireActivity() {
        System.out.println("You can play with your animal:");
       for(int i = 0; i<availableActivities.length; i++){
            System.out.print(availableActivities[i].getName() + "");
        }
        System.out.println("Please select an activity:");
        Scanner scanner = new Scanner(System.in);
        String selectedActivity = scanner.nextLine();
        activity.setName(selectedActivity);
        System.out.println("You have selected: " + activity.getName());
        adopter.playing(animal,activity);
            }

    public void start() {
        //initAnimal();
        //initAdopter();
       // initFood();
       // nameAnimal();
        //requireFeeding();
        //requireActivity();
    printActivities();
    }
    }




