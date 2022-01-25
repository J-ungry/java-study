package ch4;

import java.util.*;

public class FlowEx12 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer: //outer = while's name
        while(true){
            System.out.println("(1) Square");
            System.out.println("(2) Square root");
            System.out.println("(3) Log");
            System.out.print("Select Menu > ");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("End");
            } else if (!(1<=menu && menu<=3)){
                System.out.println("Error !");
                continue;
            }

            for(;;){
                System.out.println("Insert value >> (0:calc end , 99:program end)");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num==0) break; //end calc
                if (num==99) break outer;
                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
    }
}
