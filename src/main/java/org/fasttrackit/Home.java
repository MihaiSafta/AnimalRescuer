package org.fasttrackit;

public class Home extends Location{

    int homeSize;
    int otherPets;
    int backyard;

    public Home(String address, int homeSize, int backyard) {
        super(address);
        this.homeSize = homeSize;
        this.backyard = backyard;
    }
}

