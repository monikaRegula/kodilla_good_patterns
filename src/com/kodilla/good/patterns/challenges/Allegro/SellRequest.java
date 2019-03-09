package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class SellRequest {

    private User user;
    private LocalDateTime dateOfSelling;
    private int amountOfProduct;

    public SellRequest(final User user,final LocalDateTime dateOfSelling,final int amountOfProduct) {
        this.user = user;
        this.dateOfSelling = dateOfSelling;
        this.amountOfProduct = amountOfProduct;
    }

    public User getUser() { return user; }

    public LocalDateTime getDateOfSelling() { return dateOfSelling; }

    public int getAmountOfProduct() { return amountOfProduct; }

}
