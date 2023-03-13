package com.ci;

public class Addition {
    private int a;
    private int b;

    public Addition(int a,int b){
        this.a=a;
        this.b=b;
    }

    public Addition(double a,double b){
        System.out.println("it is Double constructor");
        this.a=(int)a;
        this.b=(int)b;
    }
    public Addition(String a,String b){
        System.out.println("It is String Constructor");
        this.a= Integer.parseInt(a);
        this.b= Integer.parseInt(b);
    }
    public void doSum(){
        System.out.println("sum of a and b "+this.a+this.b);
    }

}
