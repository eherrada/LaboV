package com.company.models;

public class BeerProducer extends Thread{

    public int producedBeer;
    public BeerHouse beerHouse;


    public BeerProducer(BeerHouse beerHouse) {
        this.setBeerHouse(beerHouse);
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    public int getProducedBeer() {
        return producedBeer;
    }

    public void setProducedBeer(int producedBeer) {
        this.producedBeer = producedBeer;
    }

    @Override
    public void run() {
        while(this.beerHouse.isFlag()){
            int max = (this.beerHouse.getCapacity() - this.beerHouse.getBeerCounter());
            int random = (int) ((Math.random() * (max - 1)) + 1);
            this.beerHouse.putBeer(random);

        }
    }

}

