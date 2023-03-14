package com.ref;

public class B {
    private int b_value;

    public B(){}

    public B(int b_value) {
        this.b_value = b_value;
    }

    public int getB_value() {
        return b_value;
    }

    public void setB_value(int b_value) {
        this.b_value = b_value;
    }

    @Override
    public String toString() {
        return "B{" +
                "b_value=" + b_value +
                '}';
    }
}
