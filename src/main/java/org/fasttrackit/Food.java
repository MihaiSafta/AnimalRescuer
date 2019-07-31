package org.fasttrackit;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Food {
    private  String name;
    private  double price;
    private  double weight;
    private  int stock;
    private  int nutritionValue;
    private  int healthbonus;
    private  String foodType;
    private  String bagType;
    private  LocalDate expirationDay;

    public Food(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public Food(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNutritionValue() {
        return nutritionValue;
    }

    public void setNutritionValue(int nutritionValue) {
        this.nutritionValue = nutritionValue;
    }

    public int getHealthbonus() {
        return healthbonus;
    }

    public void setHealthbonus(int healthbonus) {
        this.healthbonus = healthbonus;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setExpirationDay(LocalDate expirationDay) {
        this.expirationDay = expirationDay;
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
