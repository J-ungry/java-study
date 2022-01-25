package ch4;

public class FlowEx11 {
    public static void main(String[] args) {
        Loop : for(int i=2; i<=9;i++){ //for문에 이름을 지어줄 수 있음!!!!
            for(int j=1;j<=9;j++){
                if (j==5){
                    break Loop; //이렇게 break 가 가능
                }
                System.out.println(i*j);
            }
        }
    }
}
