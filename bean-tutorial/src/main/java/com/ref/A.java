package com.ref;

public class A {
    private int a_value;
    private B ob;

    public A(){}

    public A(int a_value, B ob) {
        this.a_value = a_value;
        this.ob = ob;
    }

    public int getA_value() {
        return a_value;
    }

    public void setA_value(int a_value) {
        this.a_value = a_value;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "A{" +
                "a_value=" + a_value +
                ", ob=" + ob +
                '}';
    }
}
