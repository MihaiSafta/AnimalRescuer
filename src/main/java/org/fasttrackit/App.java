package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Game game = new Game("Mark", "Athos", "Tim", 1);
        System.out.println("Game nr.1 has " + game.getAdopter() + " as adopter, " + game.getDog() + " as dog," + " and vet is " + game.getVet() + ".");

       game.start();

        Adopter Adopter = new Adopter(23, "Mark");
        Adopter.setFunds(500);
        Adopter.setName("Jimmy");
        System.out.println("Adopter name is " + Adopter.getName() + " and he has " + Adopter.getFunds() + " dollars.");

        Home home = new Home("Jump Street", 100, 350);
        home.setOtherPets(2);
        System.out.println("The home has a " + home.getAddress() + " metres backyard ," + "it is " + home.getHomeSize() + " square metres ," + "and has " + home.getOtherPets() + " other pets. The location is " + home.getAddress());

        Adopterwife adopterwife = new Adopterwife(21, "Sally");
        adopterwife.setAnimalsSheLikes("dogs");
        adopterwife.setAnimalsSheDoesNotLike("cats");
        adopterwife.setPreviuousPets(2);
        System.out.println("Adopters wife is " + adopterwife.getName() + "," + "she is " + adopterwife.getAge() + " years old." + "She likes " + adopterwife.getAnimalsSheLikes() + ", she doesnt like " + adopterwife.getAnimalsSheDoesNotLike() + ", and she had " + adopterwife.getPreviuousPets() + " previous pets.");


        Food dogfood = new Food("Happy Dog", 12.99, 25);
        dogfood.setExpirationDay(LocalDate.of(2020, 4, 10));
        System.out.println("Food name is: " + dogfood.getName() + "." + "Price is: " + dogfood.getPrice() + "." + "Weight is :" + dogfood.getWeight() + "." + " In stock : " + dogfood.getStock() + "." + "Expires on : " + dogfood.getExpirationDay() + ".");

        Activity activity = new Activity("jumping", "Park", 4);
        System.out.println("Favourite activity is : " + activity.getName() + " Favourite place is : " + activity.getPlaceOfActivity() + ". Duration : " + activity.getHoursPerDay() + " hours per day");

        Vet vet = new Vet(30, "Tim");
        vet.setSpecialization("dogs");
        vet.setAnimalsHeLikes("Dogs, cats, Horses");
        vet.setCharge(100);
        vet.setExperience(6);
        System.out.println("The doctor is " + vet.getName() + " and his specializations is " + vet.getSpecialization());


        Nurse nurse = new Nurse(21, "Sally");
        nurse.setExperience(1.5);
        System.out.println("The nurse is " + nurse.getName() + "." + "She is " + nurse.getAge() + " and she has " + nurse.getExperience() + " years experience");


        VeterinaryOffice vetoffice = new VeterinaryOffice("Jump Street", 4, 4);
        vetoffice.setDoctorNameonDuty("Tim");
        vetoffice.setNurseNameonDuty("Sally");
        vetoffice.setAppointmentsToday(10);
        vetoffice.setPlaceInLine(9);
        System.out.println("At the Veterinary Office is locates at :" + vetoffice.getAddress() + ", there are today " + vetoffice.getDoctors() + " doctors and " + vetoffice.getNurses() + " nurses." + "Doctor and nurse on duty today are " + vetoffice.getDoctorNameonDuty() + " and " + vetoffice.getNurseNameonDuty() + "." + "Total appointments for today are " + vetoffice.getAppointmentsToday() + " and place in line is number:" + vetoffice.getPlaceInLine() + ".");


        Animal dog2 = new Dog("Clul", 12, 90, 100, 100, "junk", "running", "red", "bald", "relaxed", 11);
        dog2.goodcheer();
        System.out.println(dog2);


        Food catfood = new Food("meat", 150, 55);
        Animal cat = new Cat("Luli", 12, 100, 100, 50, "meat", "jumping", "red", "smooth", "calm", 5);
        cat.goodcheer();
        System.out.println(cat);
        Adopter.playing(cat, activity);
        Adopter.feeding(cat, catfood);
        Adopter.playing(cat, activity);


    }


}