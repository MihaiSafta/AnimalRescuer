package org.fasttrackit;

public class Activity {
    private String name;
    private String placeOfActivity;
    private double hoursPerDay;
    private String animalsToPlayWith;
    private int activityHealthBonus;

    public Activity(String name, String placeOfActivity, double hoursPerDay) {
        this.name = name;
        this.placeOfActivity = placeOfActivity;
        this.hoursPerDay = hoursPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfActivity() {
        return placeOfActivity;
    }

    public void setPlaceOfActivity(String placeOfActivity) {
        this.placeOfActivity = placeOfActivity;
    }

    public double getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(double hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public String getAnimalsToPlayWith() {
        return animalsToPlayWith;
    }

    public void setAnimalsToPlayWith(String animalsToPlayWith) {
        this.animalsToPlayWith = animalsToPlayWith;
    }

    public int getActivityHealthBonus() {
        return activityHealthBonus;
    }

    public void setActivityHealthBonus(int activityHealthBonus) {
        this.activityHealthBonus = activityHealthBonus;
    }


}
