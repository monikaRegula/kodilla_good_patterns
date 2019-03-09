package com.kodilla.good.patterns.challenges.Food2Door;

public class Order  {
    private final String name;
    private final int amount;
    private final String productType;

    public Order(final String name,final int amount,final String productType) {
        this.name = name;
        this.amount = amount;
        this.productType = productType;
    }

    public String getName() { return name; }

    public int getAmount() { return amount; }

    public String getProductType() { return productType; }

    public boolean validateData(String n,int a,String p) throws Exception {
        if (n != null && a >0 && p != null){
            return true;
        }else{
            throw new Exception("Some order data are wrong!!!");
        }
    }
}
