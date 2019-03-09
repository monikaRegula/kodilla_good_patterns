package com.kodilla.good.patterns.challenges.Allegro;

public class SellDto {

    public User User;
    public boolean isSold;

    public SellDto(User user, boolean isSold) {
        User = user;
        this.isSold = isSold;
    }
}
