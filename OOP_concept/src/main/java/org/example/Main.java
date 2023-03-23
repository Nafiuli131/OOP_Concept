package org.example;

import org.example.Exception.CustomException;

//tutorial link ::::    https://www.youtube.com/watch?v=fFnuer3AD8Q&ab_channel=JavaTechie
public class Main {
    public static void main(String[] args) throws CustomException {
        System.out.println("OOP Concept: ");
        ChildOfParent childOfParent = new ChildOfParent();
        childOfParent.method1();
        //here method4 not override in child class, so call the parent class method here
        childOfParent.method4();
        Parent parent = new Parent();
        parent.method1(); //here call the method of the parent class
        Parent parent1 = new ChildOfParent(); //here we create the childclass object by the reference of parent class
        parent1.method1(); //here call the child class method
        parent1.method4(); //here no method4 call override in child class. so first it check the child class and found
        //no method4 here. then it goes to the parent class. and found method4 . so it called the parent class method.
        //this is called runtime polymorphism
        System.out.println("---------------");
        FinalConcept finalConcept = new FinalConcept();
        finalConcept.checkFinalization();
        finalConcept=null; //then this FincalConcept class has no reference, then it automatically call the finalize method.
        System.gc(); //use this for call the finalize method
        System.out.println("custom exception class");
        int a = 200;
        if(a==100){
            throw new CustomException("custom exception called here");
        }
        //there is a question on throw and throws .. study on it .......
    }
}