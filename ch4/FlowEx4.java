package ch4;

import java.util.*;

public class FlowEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Month > ");
        int month = scanner.nextInt();

        switch (month){
            case 3:  //한줄에 하나를 쓰던 여러개를 쓰던 상관없다!!!
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
        }
    }
}
