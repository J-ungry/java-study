package prac;

import java.util.Scanner;

public class ConsoleEx2 {
    static String[] argArr;

    public static void main(String[] args) {
        while (true) {
            String prompt = ">>";
            System.out.print(prompt);

            Scanner s = new Scanner(System.in);
            String input = s.nextLine();

            input =input.trim(); //앞뒤 공백 제거
//            System.out.println(input);
            String newInput = input.replaceAll("\\s+"," ");

            argArr = newInput.split(" ");

            if (newInput.equalsIgnoreCase("Q")) {
                System.exit(0);
            } else{
                for(int i=0; i<argArr.length; i++){
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
