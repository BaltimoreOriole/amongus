package com.amongus
//This is a superclass

 public class TrainYard {

    //attributes field
    public String name;

    public int track;

    public TrainYard(String name) {
        this.name = name;
    }
    public Train(String cargo, String trainid, String name, int track) {
        

    //behaviors:
    public void getName() {
        System.out.println("We are in yard" + name)
    }

    public void thing() {
        
    }
 }