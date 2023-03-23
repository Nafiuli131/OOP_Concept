package org.example.Exception;

public class ExceptionOrder {
    public static void main(String[] args) {

        //here this block is not possible, because arithmatic exception is the child of exception class.
        //so when we call exception earlier, then it's child exception class don't have the right to called
//        try{
//            System.out.println(10/0);
//        }catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }finally {
//            System.out.println("final block always be called");
//        }

        //but this is possible
        //we call child class earlier before the parent class
        //and here only airthmatic exception class is called
        //we give multiple class but it only goes to the one catch method
        //and finally block is always called
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ex){
            System.out.println("arithmatic exception");
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("parent exception");
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("final block always be called");
        }

        //and here only try and finally work
        System.out.println("-----------------");
        try{
            System.out.println(0/10);
        }catch (ArithmeticException ex){
            System.out.println("arithmatic exception");
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("parent exception");
            System.out.println(ex.getMessage());
        }finally {
            System.exit(0); //then it'll exit the method.
            //that time finally block will stop it's behaviour
            System.out.println("final block always be called");
        }
    }

}
