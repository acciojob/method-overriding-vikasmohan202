package com.driver;
//task 1
class A{

    String  meth(){
        return "Invoking method from class A";
    }
}
// task 2
class B extends A{

}

public class Main {

    public static void main(String[] args) {
        B b=new B();
        b.meth();
        B b1=new B();
        b1.meth();
    }
}