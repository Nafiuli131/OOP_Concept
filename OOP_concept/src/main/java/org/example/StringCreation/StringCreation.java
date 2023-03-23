package org.example.StringCreation;

public class StringCreation {
    public static void main(String[] args) {
        String s1 = new String("nayeem");//new keyword //here create 1 object because of new keyword//stored in heap
        String s2 = "nayeem"; //string literal //create another object, stored in scp(string constant pool area)
        //there are two ways to create string

        //string is immutable. you can not change it. unchangable
        String s = "Nafiul";
        s.concat("Islam");
        System.out.println(s); //it print only Nafiul, because string is immutable
        //but if we concate with it into another variable then it prints Nafiul Islam
        String s3 = s.concat(" Islam");
        System.out.println(s3);

        System.out.println("----------------");
        //string buffer and string builder are mutable
        StringBuffer sb = new StringBuffer("Nafiul");
        sb.append(" Islam");
        System.out.println(sb); //it print Nafiul Islam, because string buffer is mutable

        System.out.println("----------");
        StringBuilder sl = new StringBuilder("Nayeem");
        sl.append(" Islam");
        System.out.println(sl); // do the same as string buffer

    }
}
