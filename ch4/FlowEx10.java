package ch4;

public class FlowEx10 {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            if (i%3==0){
                continue; //반복문을 빠져나가게 된다
            }
            System.out.println(i);
        }
    }
}
