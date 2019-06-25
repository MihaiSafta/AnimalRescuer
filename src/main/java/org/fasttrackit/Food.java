package org.fasttrackit;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Food {
    String name;
    double price;
    double weight;
    int stock;
    int nutritionValue;
    int healthbonus;
    String foodType;
    String bagType;
    LocalDate expirationDay;



    public Food(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public LocalDate getExpirationDay() {

     return expirationDay;

    }



    // Date expirationDate;

   // public Date getExpirationDate() {
     //   return expirationDate;
    //}

    //public void setExpirationDate(String expirationDateString) {
      //  try {
        //    expirationDate = new SimpleDateFormat("dd/MM/yyyy").parse(expirationDateString);
        //} catch (ParseException e) {
          //  e.printStackTrace();
        //}
   //
   // }






}
