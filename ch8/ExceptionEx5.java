package ch8;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("정구리 짱짱 ^^");
            throw e;
        } catch(Exception e){
            System.out.println("Error msg >> "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program end");
    }
}
