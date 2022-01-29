package ch8;

public class ExceptionEx3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch(ArithmeticException ae){
            if(ae instanceof ArithmeticException){
                System.out.println("TRUE");
            }
            System.out.println("ArithmeticException Work");
        } catch (Exception e){
            System.out.println("Exception"); //A 뭐시기 예외를 제외하고 모두 처리한다.
        }
        System.out.println(6);
    }
}
