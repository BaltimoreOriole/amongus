package com.amongus;
//Main.java

public class Main {

    public static void main(String[] args) {

        TrainYard newThing = new Thing("Browns Yard");
        newThing.yardName();


        TrainYard newType = new Type(3, "Browns Yard");
        newType.trackYard();

        Train newThis = new This("EMD GP40-2", 3);
        newThis.trainTrack();

        Train newThat = new That("EMD GP40-2", "Car Carriers and Tankers");
        newThat.trainCargo();
        
    }
}