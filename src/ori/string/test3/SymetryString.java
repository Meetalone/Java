package ori.string.test3;

import java.util.Scanner;

public class SymetryString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease input a string:");
        char [] str = sb.append(sc.next()).toString().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] != str[str.length-i-1])  {
                System.out.println("It's not symmetry string.");
                break;
            }
        }
        System.out.println("It's symmetry string.");

    }
}
