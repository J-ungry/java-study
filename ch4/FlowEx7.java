package ch4;

import java.util.*;

public class FlowEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert lines  > ");
        int input = scanner.nextInt();

        for(int i = 0; i < input; i++){
            for(int j=0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
