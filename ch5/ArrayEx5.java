package ch5;
//총합과 평균
public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0; //총점
        float avarage =0f; //평균

        int[] score = {100,88,100,100,90};

        for(int i=0;i <score.length;i++){
            sum += score[i];
        }
        avarage = sum/(float)score.length;
        System.out.println("총점 >> "+sum);
        System.out.println("평균 >> "+avarage);

    }
}
