package com.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements Information {

    @Override
    public boolean inform(Order order) {
        System.out.println("MAIL: Dear "+order.getName() +" you have just sold: "+
                order.getAmount() + " of "+order.getProductType());
        return true;
    }

}
