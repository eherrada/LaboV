package com.company.models;

public class BeerHouse{

    private int beerCounter;
    private int capacity;
    private boolean flag;

    public BeerHouse() {
        this.setBeerCounter(5);
        this.setCapacity(100);
        this.setFlag(true);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getBeerCounter() {
        return beerCounter;
    }

    public void setBeerCounter(int beerCounter) {
        this.beerCounter = beerCounter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void putBeer(int value){
        while(this.getBeerCounter() >= this.getCapacity()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBeerCounter(this.getBeerCounter() + value);
        System.out.println("Pongo --> " + value + "\nHay --> " + this.getBeerCounter() + "\n");
        notifyAll();
    }

    public synchronized void getBeer(int value, String name){
        if(this.getBeerCounter() <= 0){
            try {
                this.setFlag(false);
                System.out.println("Sin Stock!");
                System.exit(0);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        else{
            this.setBeerCounter(this.getBeerCounter() - value);
            System.out.println(name + "\nTomó --> " + value + "\nHay --> " + this.getBeerCounter() + "\n");
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
