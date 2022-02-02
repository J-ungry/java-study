package prac;

import java.util.Scanner;

class QuizEx2 {
    public static void main(String[] args) {
        String[] data = {
                "다음 중 키워드가 아닌 것은?`2`final`True`if`public",
                "다음 중 자바의 연산자가 아닌 것은?`5`&`|`++`!=`/`^",
                "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false",
        };

        Scanner s = new Scanner(System.in);
        int score = 0;
        String[] answer = {"2", "6", "1"};

        String[][] arr = new String[data.length][];
        for (int i = 0; i < data.length; i++) {
            //arr[i] = data[i].split("`",data[i].length());
            arr[i] = data[i].split("`");
            System.out.println("[" + (i + 1) + "] " + arr[i][0]);// 문제 출력하기
            for (int j = 1; j < arr[i].length; j++) {
                System.out.print(j + "." + arr[i][j] + " ");
            }
            System.out.println("");
            System.out.print("[답] >> ");
            String input = s.nextLine(); // 입력받기
            if (input.equals(answer[i])) {
                score += 1;
            }

            System.out.println("");
        }
        System.out.println("정답 개수 / 전체 문항수 >> "+score+"/"+data.length);
    } // main
}
