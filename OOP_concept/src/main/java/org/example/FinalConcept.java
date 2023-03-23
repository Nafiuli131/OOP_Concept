package org.example;

public class FinalConcept {

    private final int variable = 20;

    void checkFinalization(){
//        variable = 10; //it's not possible, because final variable cannot have the option to reassign

        try{
            System.out.println("try block");
        }finally {
            System.out.println("finally block");
            //this method used for cleaning the streams
        }
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("call the finalize method");
        //this method call when this object has no reference. like object will be null
    }
}
