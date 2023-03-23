package org.example;

public class ChildOfParent extends Parent {
    @Override
    void method1() {
        System.out.println("call method 1 from child");
    }

    @Override
//    void method2() {
    void method2() throws Exception { //both possible
        System.out.println("not necessary to handle parent exception here");
    }

    @Override
    void method3() {
//    void method3() throws Exception{  it's not possible
        System.out.println("not have the rights to use exception here");
    }

    //it's not possible to override static method
//    void method5(){
//        System.out.println("call static method from parent");
//    }
}
