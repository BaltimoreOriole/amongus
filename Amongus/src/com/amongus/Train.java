package com.amongus;
//Train.java
//This is a subclass


public class Train extends TrainYard {
     //attributes
     private String trainid;
     private String cargo;

     public Train(String cargo, String trainid, String name, int track) {
        super(name, track);
        this.cargo = cargo;
        this.trainid = trainid;
     }


     //behaviors
     public void trainTrack() {
      System.out.println("Train " + trainid + " Is on track " + track + ".");
     }

     public void trainCargo() {
      System.out.println("Train " + trainid + " contains cargo of " + cargo + ".");
     }
}
