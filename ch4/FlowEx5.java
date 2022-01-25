package ch4;

import java.util.*;

public class FlowEx5 {
    public static void main(String[] args) {
        System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요");
        Scanner scanner = new Scanner(System.in);

        int user = scanner.nextInt(); //user 의 입력 정보를 저장
        int com = (int)(Math.random() * 3)+1;  //1-3사이의 난수 생성

        System.out.println("User > "+user);
        System.out.println("Com > "+com);

        switch (user-com){
            case 2: case -1:
                System.out.println("Lose !");
                break;
            case 1: case -2:
                System.out.println("Win !");
                break;
            case 0:
                System.out.println("Draw !");
        }
    }
}
