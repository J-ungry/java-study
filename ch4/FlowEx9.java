package ch4;

import java.util.*;

public class FlowEx9 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while(flag){
            System.out.println(">>");
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0){
                sum += num;
            } else{
                flag = false;
            }
        }
        System.out.println("Sum >>"+sum);
    }
}
