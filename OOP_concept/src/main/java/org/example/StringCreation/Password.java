package org.example.StringCreation;

public class Password {
    public static void main(String[] args) {
        //always recommened to store password into char array rather than string
        String s = "abcdef";
        char[] ch = new char[]{'a','b','c','d'};
        System.out.println(s); //it print plain text
        System.out.println(ch); //it print context, so it's safe for security purpose

    }
}
