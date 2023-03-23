package org.example.HashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        EmployeeWithoutHashAndEquals employeeWithoutHashAndEquals1 = new EmployeeWithoutHashAndEquals(1,"nayeem");
        EmployeeWithoutHashAndEquals employeeWithoutHashAndEquals2 = new EmployeeWithoutHashAndEquals(1,"nayeem");

        //here set not working, because hashcode and  equals not implemented
        Set<EmployeeWithoutHashAndEquals> employeeWithoutHashAndEqualsSet = new HashSet<>();
        employeeWithoutHashAndEqualsSet.add(employeeWithoutHashAndEquals1);
        employeeWithoutHashAndEqualsSet.add(employeeWithoutHashAndEquals2);
        System.out.println(employeeWithoutHashAndEqualsSet);
        System.out.println("-------------");
        //here set working, because hashcode and  equals implemented

        EmployeeWithHashAndEquals employeeWithoutHashAndEquals3 = new EmployeeWithHashAndEquals(1,"nayeem");
        EmployeeWithHashAndEquals employeeWithoutHashAndEquals4 = new EmployeeWithHashAndEquals(1,"nayeem");
        Set<EmployeeWithHashAndEquals> employeeWithHashAndEqualsSet = new HashSet<>();
        employeeWithHashAndEqualsSet.add(employeeWithoutHashAndEquals3);
        employeeWithHashAndEqualsSet.add(employeeWithoutHashAndEquals4);
        System.out.println(employeeWithHashAndEqualsSet);
        //here only add this in one time.

        //in spring boot we need to use @EqualsAndHashCode annotation for create this hashcode and equals
        //and obviously lombok is needed to do that
    }
}
