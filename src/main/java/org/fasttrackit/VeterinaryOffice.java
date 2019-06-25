package org.fasttrackit;

public class VeterinaryOffice extends Location {
    private int doctors;
    private int nurses;
    private String doctorNameonDuty;
    private String nurseNameonDuty;
    private int appointmentsToday;
    private int placeInLine;

    public VeterinaryOffice(String address, int doctors, int nurses) {
        super(address);
        this.doctors = doctors;
        this.nurses = nurses;
    }

    public int getDoctors() {
        return doctors;
    }

    public void setDoctors(int doctors) {
        this.doctors = doctors;
    }

    public int getNurses() {
        return nurses;
    }

    public void setNurses(int nurses) {
        this.nurses = nurses;
    }

    public String getDoctorNameonDuty() {
        return doctorNameonDuty;
    }

    public void setDoctorNameonDuty(String doctorNameonDuty) {
        this.doctorNameonDuty = doctorNameonDuty;
    }

    public String getNurseNameonDuty() {
        return nurseNameonDuty;
    }

    public void setNurseNameonDuty(String nurseNameonDuty) {
        this.nurseNameonDuty = nurseNameonDuty;
    }

    public int getAppointmentsToday() {
        return appointmentsToday;
    }

    public void setAppointmentsToday(int appointmentsToday) {
        this.appointmentsToday = appointmentsToday;
    }

    public int getPlaceInLine() {
        return placeInLine;
    }

    public void setPlaceInLine(int placeInLine) {
        this.placeInLine = placeInLine;
    }
}

