package org.fasttrackit;

public class VeterinaryOffice extends Location {
    int doctors;
    int nurses;
    String doctorNameonDuty;
    String nurseNameonDuty;
    int appointmentsToday;
    int placeInLine;

    public VeterinaryOffice(String address, int doctors, int nurses) {
        super(address);
        this.doctors = doctors;
        this.nurses = nurses;
    }
}
