package ch2;

import java.util.*;

public class ScannerEx {
    public static void main(String[] args) {
        //다양한 방법으로 입력받을 수 있지만
        //그냥 입력받고 변환하는게 짱이시다
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 입력하기 : ");
        String input = scanner.nextLine(); //우선 스트링으로 입력받고
        int num = Integer.parseInt(input); //정수형으로 파싱해준다

        System.out.println("input : "+input);
        System.out.printf("num : %d%n",num);
    }
}
