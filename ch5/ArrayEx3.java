package ch5;
//for문을 사용한 배열 복사하기
import java.util.Arrays;
public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println("<< 변경 전 >> ");
        System.out.println("arr.length >>"+arr.length);
        for(int i=0; i<arr.length;i++){
            System.out.println("arr["+i+"] >> "+arr[i]);
        }

        int[] tmp = new int[arr.length*2];

        for(int i=0; i<arr.length; i++){
            tmp[i] = arr[i]; //내용 복사하기
        }

        arr = tmp; //arr에 저장 된 값을 tmp에 저장한다 (주소값? 같은거 저장하는거인듯)

        System.out.println("<< 변경후 >>");
        System.out.println("arr.length : "+arr.length);
        System.out.println("tmp >> "+Arrays.toString(tmp));
        System.out.println("arr >> "+Arrays.toString(arr));

    }
}
