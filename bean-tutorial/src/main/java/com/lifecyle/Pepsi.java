package com.lifecyle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public Pepsi(){}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }


    /**
     *
      * using init function for bean, but here, will interface [InitializingBean]
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init interface for Pepsi function");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy function by using interface");
    }
}
