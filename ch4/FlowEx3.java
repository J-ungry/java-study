package ch4;

import java.util.*;

public class FlowEx3 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("Insert Score > ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); //입력 받은 숫자를 score 에 저장

        if (score >= 90){
            grade = 'A';
        }
        else if (score >= 80){
            grade = 'B';
        }
        else if ( score >= 70){
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        System.out.println("Your grade > "+grade);
    }
}
