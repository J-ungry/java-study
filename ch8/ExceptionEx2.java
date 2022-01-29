package ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0); //여기서 예외가 발생했음 !!!
            System.out.println(4); //따라서 4는 출력되지 않는다
        } catch(ArithmeticException e){
            System.out.println(5);
        }
        System.out.println(6);
    }
}
