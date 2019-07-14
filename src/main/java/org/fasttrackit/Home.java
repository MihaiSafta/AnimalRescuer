package org.fasttrackit;

public class Home extends Location {

    private int homeSize;
    private int otherPets;
    private int backyard;

    public Home(String address, int homeSize, int backyard) {
        super(address);
        this.homeSize = homeSize;
        this.backyard = backyard;
    }

    public int getHomeSize() {
        return homeSize;
    }

    public void setHomeSize(int homeSize) {
        this.homeSize = homeSize;
    }

    public int getOtherPets() {
        return otherPets;
    }

    public void setOtherPets(int otherPets) {
        this.otherPets = otherPets;
    }

    public int getBackyard() {
        return backyard;
    }

    public void setBackyard(int backyard) {
        this.backyard = backyard;
    }
}

