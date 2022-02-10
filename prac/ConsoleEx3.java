package prac;

import java.util.LinkedList;
import java.util.Scanner;

public class ConsoleEx3 {
    static String[] argArr;
    static LinkedList q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String prompt =">>";
            System.out.print(prompt);

            String input = s.nextLine();

            save(input);

            input = input.trim();
            argArr = input.split("+");

            String
        }
    }
}
