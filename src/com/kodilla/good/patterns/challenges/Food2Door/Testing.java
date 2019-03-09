package com.kodilla.good.patterns.challenges.Food2Door;

public class Testing {
    public static void main(String[] args) throws Exception {

        Distribution distribution = new Distribution();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("extraFoodShop");
        Order order1 = new Order(extraFoodShop.getName(),1000,"milk");
        Order order2 = new Order(extraFoodShop.getName(),1000,"yoghurt");

        HealthyShopp healthyShopp = new HealthyShopp("healthyShop");
        Order order3 = new Order(healthyShopp.getName(),2000,"vegetables");
        Order order = new Order(healthyShopp.getName(),-3,"f");
        distribution.createOrder(order);

        distribution.createOrder(order1);
        distribution.createOrder(order2);
        distribution.createOrder(order3);

        extraFoodShop.process(order1);
        extraFoodShop.process(order2);
        healthyShopp.process(order3);
        //dla order błąd bo ilośćdała ma na minusie więc wyskakuje Eception
        //healthyShopp.process(order);
    }
}
