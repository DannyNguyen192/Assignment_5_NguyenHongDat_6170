package Lec07_Strings;

import java.util.Scanner;

public class Ex10_WordCensor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to censor: ");
        String word = sc.next();

        String replace = sentence.replace(word, "****");
        System.out.println("Censored: " + replace);
    }
}
