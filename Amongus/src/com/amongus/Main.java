package com.amongus;
//Main.java

public class Main {

    public static void main(String[] args) {

        Train newTrain = new Train("Car Carriers and Tankers", "EMD GP40-2", "Browns Yard", 3);
        newTrain.yardName();
        newTrain.trackYard();
        newTrain.trainTrack();
        newTrain.trainCargo();

        TrainYard newTrainYard = new TrainYard("Browns Yard", 3);
        newTrainYard.yardName();
        newTrainYard.trackYard();


       // TrainYard newType = new Type(3, "Browns Yard");
       // newType.trackYard();

        //Train newThis = new This("EMD GP40-2", 3);
        //newThis.trainTrack();

        //Train newThat = new That("EMD GP40-2", "Car Carriers and Tankers");
       // newThat.trainCargo();
        
    }
}