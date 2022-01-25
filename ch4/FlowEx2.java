package ch4;

import java.util.*; //scanner

public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        System.out.println("숫자 입력하기 > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if (input==0){
            System.out.println("입력한 숫자는 0 이다");
        }
        if (input!=0){
            System.out.printf("입력한 숫자는 %d 이다.",input);
        }

        if(input == 0){
            System.out.println("입력한 숫자는 0이다");
        }
        else{
            System.out.printf("입력한 숫자는 %d 이다",input);
        }
    }
}
