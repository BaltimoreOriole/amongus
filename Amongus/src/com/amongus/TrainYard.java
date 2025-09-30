package com.amongus;
//TrainYard.java
//This is a superclass

 public class TrainYard {

    //attributes field
    public String name;

    public int track;

    public TrainYard(String name, int track) {
        this.name = name;
        this.track = track;
    }

    
        
    
        

    //behaviors:
    public void yardName() {
        System.out.println("We are in yard " + name + ".");
    }

    public void trackYard() {
        System.out.println("Track " + track + " is in yard " + name + ".");
    }
    
 }