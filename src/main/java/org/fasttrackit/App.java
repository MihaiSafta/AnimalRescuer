package org.fasttrackit;


import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class App
{
    public static void main( String[] args )
    {
Animal dog = new Animal();
dog.age = 2;
dog.favouritefood = "pizza";
dog.favouritesport = "running";
dog.foodlevel = 55;
dog.happyness = 80;
dog.name = "Athos";
System.out.println("Dog name is " + dog.name);


Adopter Adopter = new Adopter();
Adopter.name = "Mark";
Adopter.funds = 500;
System.out.println("Adopter name is " + Adopter.name + " and he has " + Adopter.funds + " dollars ");


Food food = new Food();
  food.name = "Happy Dog";
food.availability = 5;
food.price = 125;
food.weight = 10.5;
        LocalDate today = LocalDate.now();
        LocalDate ExpirationDate = today.plus(3, YEARS);
System.out.println("Food name is :" + food.name + "." + "Price is : " + food.price + "." + "Weight is :" + food.weight + "." + " In stock : " + food.availability + "." +"Expires on : " + ExpirationDate + "." + "Today is :" + today);

Activity activity = new Activity();
activity.name = "Fetch" + " , " +"Running" + " , " + "Barking";
        System.out.println("Favourite activity is : " + activity.name);

Vet vet = new Vet();
vet.name = "Doctor Tim";
vet.specialization = "dogs";
        System.out.println("The doctor is " + vet.name + " and his specializations is " + vet.specialization);












    }
}
