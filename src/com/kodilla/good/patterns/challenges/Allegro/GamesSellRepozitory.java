package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class GamesSellRepozitory implements SellRepository {

    @Override
    public void createOrder(User user, LocalDateTime when, int amount) {
        System.out.println(user.getName()+" "+user.getLastName() +" is buying at the date: "+when.toString() + " amount of product: "+amount);
    }
}
