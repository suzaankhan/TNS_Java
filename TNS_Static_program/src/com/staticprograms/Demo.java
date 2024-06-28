package com.staticprograms;

public class Demo {

    static{
        System.out.println("Static block 1");
    }
    static{
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        MyClass.display();
        MyClass obj = new MyClass();
        MyClass.display();
        System.out.println(obj);
    }

}
