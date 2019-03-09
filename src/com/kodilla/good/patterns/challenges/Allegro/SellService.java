package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface SellService {

    boolean sell(User user, LocalDateTime when, int amountOfProduct);
}
