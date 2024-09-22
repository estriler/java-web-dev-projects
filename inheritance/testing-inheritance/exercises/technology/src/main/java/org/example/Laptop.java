package org.example;

public class Laptop extends Computer{
    private double weight;
    private boolean videoCall = false;

    //Constructor
    public Laptop(double aWeight,  boolean aVideoCall, double aPrice, int aRam, int aMemory, boolean aHasVirus){
        super(aPrice, aRam, aMemory, aHasVirus);
        weight = aWeight;
        videoCall = aVideoCall;
    }

    //Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isVideoCall() {
        return videoCall;
    }

    public void setVideoCall(boolean videoCall) {
        this.videoCall = videoCall;
    }

    //Methods
    public void makeVideoCall(){
        videoCall = true;
    }
}
