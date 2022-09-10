package com.company;

public class Main {

    public static void main(String[] args) {


        long year = 365;
        int currentpopulation = 312032486;
        int birthperseconds = 7;
        int deathperseconds = 13;
        int immigrantsperseconds = 45;

        long yearSec = year * 24 * 60 * 60;

        double birthrate = yearSec/birthperseconds;
        double deathrate = yearSec/deathperseconds;
        double immigrantrate = yearSec/immigrantsperseconds;

        double rateperyear = birthrate - deathrate + immigrantrate;




        System.out.println("Current population is " + currentpopulation);
        System.out.println("Population at end of year 1 is " +(int)(currentpopulation + (rateperyear * 1)));
        System.out.println("Population at end of year 2 is " +(int)(currentpopulation + (rateperyear * 2)));
        System.out.println("Population at end of year 3 is " +(int)(currentpopulation + (rateperyear * 3)));
        System.out.println("Population at end of year 4 is " +(int)(currentpopulation + (rateperyear * 4)));
        System.out.println("Population at end of year 5 is " +(int)(currentpopulation + (rateperyear * 5)));
    }
}

