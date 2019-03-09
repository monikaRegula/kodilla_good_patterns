package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShopp extends  Client implements Supplier{

    public HealthyShopp(String name) {
        super(name);
    }


    @Override
    public SellDto process(final Order order) throws Exception {

        MailService mailService = new MailService();
       boolean isCLient = order.validateData(order.getName(),order.getAmount(),order.getProductType());
        if (isCLient){
            mailService.inform(order);
            System.out.println("Success :)");
            return new SellDto(order.getName(),true);
        }else{
            return new SellDto(order.getName(),false);
        }
    }
}
