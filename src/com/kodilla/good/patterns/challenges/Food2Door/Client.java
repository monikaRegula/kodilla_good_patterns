package com.kodilla.good.patterns.challenges.Food2Door;

public abstract class Client {
    private final String name;

    public Client(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
