package ch8;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            ae.printStackTrace(); //전체 예외 메세지를 출력한다
            System.out.println(ae.getMessage());//예외 메세지 안의 저장된 메세지를 얻을 수 있다
        }
        System.out.println(6);
    }
}
