package com.company;

import com.company.models.BeerConsumer;
import com.company.models.BeerHouse;
import com.company.models.BeerProducer;

public class Main {

    public static void main(String[] args) {
        BeerHouse bh = new BeerHouse();
        BeerConsumer bc = new BeerConsumer(bh);
        BeerConsumer bc2 = new BeerConsumer(bh);
        BeerConsumer bc3 = new BeerConsumer(bh);
        BeerConsumer bc4 = new BeerConsumer(bh);
        BeerProducer bp = new BeerProducer(bh);
        bc.start();
        bc2.start();
        //bc3.start();
        //bc4.start();
        bp.start();
    }
}
