package org.example;

public class Parent {

    void method1() {
        System.out.println("method 1 from parent");
    }

    //if parent method throw exception, then child class can use it or not
    //but if the parent method don't throw exception, then child class don't use exception
    void method2() throws Exception {
        System.out.println("method 2 from parent");
    }

    //here this method has no exception throwing, so child class don't use exception here
    void method3() {
        System.out.println("method 3 from parent");
    }

    void method4() {
        System.out.println("method 4 in parent class");
    }

    //here it's not possible to override static method in child class
    static void method5() {
        System.out.println("static method5 from parent");
    }
}
