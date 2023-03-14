package com.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * we are using autowire concept by using @Autowired annotation
 * Note: if we are placing @Autowired annotation above inner class name , it behave like ByName annotation
 *     : if we are placing @Autowired annotation above setter function , it behave like BySetter annotation
 *     : if we are placing @Autowired annotation above constructor , it behave like constructor annotation
 */
public class Emp {
    @Autowired
    @Qualifier("address1")
    private Address address;
    public Emp(){}

    public Emp(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
