package com.lifecyle;

public class Samosa {
    private double price;
    public Samosa(){}

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("it is setting function of price!");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    
//    implemented init function
    public void init(){
        System.out.println("This is initial function of the Samosa class!");
    }
    public void destroy(){
        System.out.println("This is the destroy function of the Samosa class!");
    }
}
