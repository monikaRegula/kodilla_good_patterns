package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop extends Client implements Supplier{

    public ExtraFoodShop(String name) {
        super(name);
    }

    @Override
    public SellDto process(final Order order) throws Exception {
        MailService mailService = new MailService();
        boolean isClient = order.validateData(order.getName(),order.getAmount(),order.getProductType());
        if (isClient){
            mailService.inform(order);
            System.out.println("Mission completed");
        }else{
            return new SellDto(order.getName(),false);
        }
        return null;
    }


}
