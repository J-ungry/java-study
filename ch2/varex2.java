package ch2;

public class varex2 {
    public static void main(String[] args) {
        //저장되어 있는 숫자를 서로 바꾸는 코드
        int x = 20, y = 30;
        int tmp;
        System.out.println("x :"+x+" y :"+y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x :"+x+" y :"+y);
    }
}
