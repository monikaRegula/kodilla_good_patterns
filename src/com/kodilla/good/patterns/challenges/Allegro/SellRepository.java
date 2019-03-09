package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public interface SellRepository {

void createOrder(User user, LocalDateTime when, int amount);
}
