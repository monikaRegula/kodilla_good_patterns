package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public  class GamesSellService implements SellService{

    public boolean sell(final User user, final LocalDateTime when, final int amount){
        System.out.println("Selling games for: "+ user.getName() + " "+user.getLastName()+ " date:"+when.toString()+ " amount of product: "+amount);
        return true;
    }

}
