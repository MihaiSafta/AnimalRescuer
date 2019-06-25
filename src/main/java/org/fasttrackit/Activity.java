package org.fasttrackit;

public class Activity {
    String name;

    String placeOfActivity;
    double hoursPerDay;
    String animalsToPlayWith;
    int activityHealthBonus;

    public Activity(String name, String placeOfActivity, double hoursPerDay) {
        this.name = name;
        this.placeOfActivity = placeOfActivity;
        this.hoursPerDay = hoursPerDay;
    }
}
