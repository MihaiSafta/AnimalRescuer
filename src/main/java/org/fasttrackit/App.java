package org.fasttrackit;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {

        Game game = new Game("Mark","Athos","Tim",1);
        System.out.println("Game nr.1 has " + game.adopter + " as adopter, " + game.dog + " as dog," + " and vet is " + game.vet + ".");

        Adopter Adopter = new Adopter(23, "Mark");
        Adopter.funds = 500;
        System.out.println("Adopter name is " + Adopter.name + " and he has " + Adopter.funds + " dollars.");

        Home home = new Home("Jump Street", 100,350);
        home.otherPets = 2;
        System.out.println("The home has a " + home.backyard + " metres backyard ," + "it is " + home.homeSize + " square metres ," + "and has " + home.otherPets + " other pets. The location is " + home.address);

        Adopterwife adopterwife = new Adopterwife(21,"Sally");
        adopterwife.animalsSheLikes = "dogs";
        adopterwife.animalsSheDoesNotLike = "cats";
        adopterwife.previuousPets = 2;
        System.out.println("Adopters wife is " + adopterwife.name + "," + "she is " + adopterwife.age + " years old." + "She likes " + adopterwife.animalsSheLikes + ", she doesnt like " + adopterwife.animalsSheDoesNotLike + ", and she had " + adopterwife.previuousPets + " previous pets.");


        Animal dog = new Animal("Athos", 3);
        dog.favouritefood = "pizza";
        dog.favouritesport = "running";
        dog.foodlevel = 55;
        dog.happyness = 80;
        dog.healthlevel = 100;
        System.out.println("Dog name is " + dog.name + " he is " + dog.age + " years old " + " his favourite food is " + dog.favouritefood + ", his favourite sport is " + dog.favouritesport + " , happiness level is " + dog.happyness + " % " + "and health level is " + dog.healthlevel + "%.");

        Food dogfood = new Food("Happy Dog", 12.99, 25);
        dogfood.weight = 10.5;
        dogfood.expirationDay = LocalDate.of(2020, 11, 12);
        System.out.println("Food name is: " + dogfood.name + "." + "Price is: " + dogfood.price + "." + "Weight is :" + dogfood.weight + "." + " In stock : " + dogfood.stock + "." + "Expires on : " + dogfood.expirationDay + ".");

        Activity activity = new Activity("Fetch", "Park", 4);
        System.out.println("Favourite activity is : " + activity.name + " Favourite place is : " + activity.placeOfActivity + ". Duration : " + activity.hoursPerDay + " hours per day");

        Vet vet = new Vet(30,"Tim");
        vet.specialization = "dogs";
        System.out.println("The doctor is " + vet.name + " and his specializations is " + vet.specialization);


        Nurse nurse = new Nurse(21,"Sally");
        nurse.experience = 1.5;
        System.out.println("The nurse is " + nurse.name + "." + "She is " + nurse.age + " and she has " + nurse.experience + " years experience");


        VeterinaryOffice vetoffice = new VeterinaryOffice("Jump Street", 4, 4);
        vetoffice.doctorNameonDuty = "Tim";
        vetoffice.nurseNameonDuty = "Sally";
        vetoffice.appointmentsToday = 10;
        vetoffice.placeInLine = 9;
        System.out.println("At the Veterinary Office is locates at :" + vetoffice.address + ", there are today " + vetoffice.doctors + " doctors and " + vetoffice.nurses + " nurses." + "Doctor and nurse on duty today are " + vetoffice.doctorNameonDuty + " and " + vetoffice.nurseNameonDuty + "." + "Total appointments for today are " + vetoffice.appointmentsToday + " and place in line is number:" + vetoffice.placeInLine + ".");


    }
}