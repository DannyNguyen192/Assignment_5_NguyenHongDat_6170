package Lec07_Strings;

public class Ex3_ImmutableString_Concat {

    public static void main(String[] args) {
        String s = " Duy Tan ";
        System.out.println("Using +:" + s + "Univeristy");
        System.out.println("Using concat: " + s.concat("University"));
        s.concat("University");
        System.out.println("first after concat without reassignment: " + s);
    }
}
