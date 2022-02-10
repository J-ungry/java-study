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
            argArr = input.split(" ");

            String command = argArr[0].trim();

            if("".equals(command)) continue;

            command = command.toLowerCase();

            if(command.equals("q")){
                System.exit(0);
            }else if(command.equals("history")){
                history();
            } else{
                for(int i=0; i<argArr.length;i++){
                    System.out.println(argArr[i]);
                }
            }
        }
    }
    public static void save(String input){
        if(input==null || "".equals(input)) return;
        if(q.size() < MAX_SIZE){
            q.add(input);
        }else{
            q.removeFirst();
            q.add(input);
        }

    }
    public static void history(){
        for(int i=0 ;i<q.size();i++){
            System.out.println((i+1)+". "+q.get(i));
        }
    }
}
