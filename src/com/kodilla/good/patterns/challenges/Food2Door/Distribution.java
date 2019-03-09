package com.kodilla.good.patterns.challenges.Food2Door;

public  class Distribution implements Repozitory{

    @Override
    public void createOrder(Order order) {
        System.out.println("=============== "+order.getName()+" wants to be sell us sth ================");
    }
}
