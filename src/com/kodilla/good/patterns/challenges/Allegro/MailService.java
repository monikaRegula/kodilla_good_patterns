package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public  class MailService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Welcome "+user.getName()+" on Allegro. ");
    }
}
