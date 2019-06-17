package org.fasttrackit;


import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static java.time.temporal.ChronoUnit.YEARS;

public class App
{
    public static void main( String[] args )
    {

        Game game = new Game();
        game.gamenumber = 1;
        game.adopter = "Mark";
        game.dog = "Athos";
        game.vet = "Tim";
        System.out.println("Game nr.1 has " + game.adopter + " as adopter, " + game.dog + " as dog," + " and vet is " + game.vet + ".");


        Adopter Adopter = new Adopter();
        Adopter.name = "Mark";
        Adopter.funds = 500;
        System.out.println("Adopter name is " + Adopter.name + " and he has " + Adopter.funds + " dollars.");


        Home home = new Home();
        home.backyard = 500;
        home.homeSize = 200;
        home.otherPets = 2;
        System.out.println("The home has a " + home.backyard + " metres backyard ," + "it is " + home.homeSize + " square metres ," + "and has " + home.otherPets + " other pets.");

Adopterwife adopterwife = new Adopterwife();
adopterwife.name = "Sally";
adopterwife.age = 25;
adopterwife.animalsSheLikes = "dogs";
adopterwife.animalsSheDoesNotLike = "cats";
adopterwife.previuousPets = 2;
        System.out.println("Adopters wife is " + adopterwife.name + "," + "she is " + adopterwife.age + " years old." + "She likes " + adopterwife.animalsSheLikes + ", she doesnt like " + adopterwife.animalsSheDoesNotLike + ", and she had " + adopterwife.previuousPets + " previous pets.");


Animal dog = new Animal();
dog.age = 2;
dog.favouritefood = "pizza";
dog.favouritesport = "running";
dog.foodlevel = 55;
dog.happyness = 80;
dog.healthlevel = 100;
dog.name = "Athos";
System.out.println("Dog name is " + dog.name + " he is " + dog.age + " years old " + " his favourite food is " + dog.favouritefood + ", his favourite sport is " + dog.favouritesport + " , happiness level is " + dog.happyness + " % " + "and health level is " + dog.healthlevel + "%.");

Food dogfood = new Food();
  dogfood.name = "Happy Dog";
dogfood.stock = 5;
dogfood.price = 125;
dogfood.weight = 10.5;
dogfood.setExpirationDate("31/12/2021");

        System.out.println("Food name is: " + dogfood.name + "." + "Price is: " + dogfood.price + "." + "Weight is :" + dogfood.weight + "." + " In stock : " + dogfood.stock + "." +"Expires on : " + dogfood.getExpirationDate()+ ".");

Activity activity = new Activity();
activity.name = "Fetch" + " , " +"Running" + " , " + "Barking";
        System.out.println("Favourite activity is : " + activity.name);

Vet vet = new Vet();
vet.name = "Doctor Tim";
vet.specialization = "dogs";
        System.out.println("The doctor is " + vet.name + " and his specializations is " + vet.specialization);

        Nurse nurse = new Nurse();
        nurse.name = "Mary";
        nurse.age = 21;
        nurse.experience = 1.5;
        System.out.println("The nurse is " + nurse.name + "." + "She is " + nurse.age + " and she has " + nurse.experience +" years experience");



VeterinaryOffice vetoffice = new VeterinaryOffice();
vetoffice.doctorNameonDuty = "Tim";
vetoffice.doctors = 2;
vetoffice.nurseNameonDuty = "Sally";
vetoffice.nurses = 4;
vetoffice.appointmentsToday = 10;
vetoffice.placeInLine = 9;
        System.out.println("At the Veterinary Office there are today " + vetoffice.doctors + " doctors and " + vetoffice.nurses + " nurses." + "Doctor and nurse on duty today are " + vetoffice.doctorNameonDuty + " and " + vetoffice.nurseNameonDuty + "." + "Total appointments for today are " + vetoffice.appointmentsToday + " and place in line is number:" + vetoffice.placeInLine + ".");








    }
}
