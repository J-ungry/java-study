package ch5;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int[] add = {1,2,3,4,5}; //이런식으로 선언 가능

        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2]+score[4];

        for (int i = 0; i <score.length; i++){
            System.out.println(score[i]);
        }
        System.out.println(tmp);
        System.out.println(Arrays.toString(score));

    }
}
