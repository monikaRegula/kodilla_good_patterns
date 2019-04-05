package com.kodilla.good.patterns.challenges.Airlines;

import java.util.Objects;

public class Flight {
    private String from;
    private String to;
    private boolean by;
    private int price;

    public Flight(String from, String to, boolean by, int price) {
        this.from = from;
        this.to = to;
        this.by = by;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean getBy() {
        return by;
    }

    public void setBy(boolean by) {
        this.by = by;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", by='" + by + '\'' +
                ", price=" + price +
                '}';
    }
}
