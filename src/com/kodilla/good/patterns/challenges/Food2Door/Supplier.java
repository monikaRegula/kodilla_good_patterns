package com.kodilla.good.patterns.challenges.Food2Door;

public interface Supplier {
    SellDto process(Order order) throws Exception;
}
