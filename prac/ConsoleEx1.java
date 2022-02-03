package prac;

import java.util.*;
public class ConsoleEx1 {
    public static void main(String[] args){
        while(true){
            String prompt = ">>";
            System.out.print(prompt);

            Scanner s = new Scanner(System.in);
            String input = s.nextLine();
            if(input.equals("q")||input.equals("Q")){
                break;
            }else System.out.println(input);

        }
    }
}
