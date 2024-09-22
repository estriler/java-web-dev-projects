package org.example;

public class Computer {
    private double price;
    private int ram;
    private int memory;
    private boolean hasVirus = false;

    //Constructor
    public Computer(double aPrice, int aRam, int aMemory, boolean aHasVirus){
        price = aPrice;
        ram = aRam;
        memory = aMemory;
        hasVirus = aHasVirus;

    }

    //Getters and Setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isHasVirus() {
        return hasVirus;
    }

    public void setHasVirus(boolean hasVirus) {
        this.hasVirus = hasVirus;
    }

    //Methods
    public String download(String program){
        return program;
    }

    public boolean virusCheck(boolean hasVirus){
        if(hasVirus){
            return true;
        }else{
            return false;
        }
    }


}
