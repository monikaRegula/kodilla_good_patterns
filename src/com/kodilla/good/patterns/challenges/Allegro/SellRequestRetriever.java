package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class SellRequestRetriever {

    public SellRequest retrieve(){

        User user = new User("Anna","Kowalska");
        LocalDateTime date =  LocalDateTime.of(2019,2,27,19,57);
        int amount = 4;

        return new SellRequest(user,date,amount);
    }
}
