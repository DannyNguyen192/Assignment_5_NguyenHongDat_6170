package Lec07_Strings;

import java.util.Scanner;

public class Ex8_CountChar {

    public static int occurenceCount(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (target == text.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter character to count: ");
        char target = sc.next().charAt(0);
        System.out.println("Occcurences of '" + target + "': " + occurenceCount(text, target));
    }
}
