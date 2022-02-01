package prac;

import java.util.*;

class WordScrambleEx3 {
    public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};
        boolean check = true;
        while(true) {
            String answer = getAnswer(strArr);
            String question = getScrambledWord(answer);
            while(true){
                System.out.println("Question :" + question);
                System.out.print("Your answer is :");
                Scanner scanner = new Scanner(System.in); //입력 받기
                String input = scanner.nextLine();
                System.out.println("Your answer is >> "+input);
                if(input.equals("q")||input.equals("Q")){
                    check = false;
                    break;
                }else {
                    if(input.equalsIgnoreCase(answer)){
                        System.out.println("정답입니다");
                        break;
                    }else{
                        System.out.println(input+"은 정답이 아닙니다 다시 시도해보세요");
                    }
                }
            }
            if (check==false) break;
        } // while

    } // main

    public static String getAnswer(String[] strArr) {
        int idx = (int)(Math.random()*strArr.length);
        return strArr[idx];
    }

    public static String getScrambledWord(String str) {
        char[] chArr = str.toCharArray();

        for(int i=0;i < str.length();i++) {


            int idx = (int)(Math.random()*str.length());

            char tmp = chArr[i];
            chArr[i] = chArr[idx];
            chArr[idx] = tmp;
        }

        return new String(chArr);
    } // scramble(String str)
}

