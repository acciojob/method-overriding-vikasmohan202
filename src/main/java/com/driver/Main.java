package com.driver;
//task 1
class A{

    String  meth(){
        return "Invoking method from class A";
    }
}
// task 2
class B extends A{
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {

    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.meth());

    }
}