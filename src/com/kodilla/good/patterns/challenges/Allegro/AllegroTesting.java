package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class AllegroTesting {
    public static void main(String[] args) {

        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.retrieve();

        SellProcessor sellProcessor = new SellProcessor(
                new MailService(),new GamesSellService(),new GamesSellRepozitory());

        User user = new User("Anna","Kowalska");
        LocalDateTime date =  LocalDateTime.of(2019,2,27,19,57);
        int amount = 4;

        GamesSellService gamesSellService = new GamesSellService();
        boolean isSold = gamesSellService.sell(user,date,amount);

        MailService mailService = new MailService();
        GamesSellRepozitory gamesSellRepozitory = new GamesSellRepozitory();

        if (isSold){
            mailService.inform(user);
            gamesSellRepozitory.createOrder(user,date,amount);
        }else{
            System.out.println("Games has not been sold");
        }


    }
}
