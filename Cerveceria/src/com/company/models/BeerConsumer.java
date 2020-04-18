package com.company.models;

public class BeerConsumer extends Thread{

    private BeerHouse beerHouse;


    public BeerConsumer(BeerHouse beerHouse) {
        super();
        setBeerHouse(beerHouse);
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }




    @Override
    public void run() {
        while(this.beerHouse.isFlag()){
            int random = (int) (Math.random() * (this.beerHouse.getBeerCounter() - 1)) + 1;
            this.beerHouse.getBeer(random, this.getName());
        }
    }
}
