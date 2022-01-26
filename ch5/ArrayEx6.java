package ch5;
//최대값과 최소값
public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};

        int max = score[0];
        int min = score[0];

        int len_score = score.length;

        for(int i=1;i<len_score;i++){
            if (score[i] >= max) {
                max = score[i];
            }else if (score[i] <= min) {
                min = score[i];
            }
        }

        System.out.println("max >> "+max);
        System.out.println("min >> "+min);
    }
}
