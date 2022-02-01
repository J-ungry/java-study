package prac;

/*
[문제1] 다음의 예제를 완성하시오.

getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)

getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.

                                             (Math.random()사용)

 */
class WordScrambleEx1 {
    public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);

        System.out.println("Question:"+question);
        System.out.println("Answer:"+answer);
    } // main

    public static String getAnswer(String[] strArr) {
        int num = (int)(Math.random()*4);
        return strArr[num];

    }

    public static String getScrambledWord(String str) {
        char[] arr = new char[str.length()];

        for(int i=0; i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        /*
        char[] arr = str.toCharArray();
         */
        int randNum1,randNum2;
        char a,b;
        for(int i=0; i<arr.length;i++){
            randNum1 = (int)(Math.random()*arr.length);
            a = arr[randNum1];
            randNum2 = (int)(Math.random()*arr.length);
            b = arr[randNum2];
            arr[randNum1] = b;
            arr[randNum2] = a;
        }
        return new String(arr);



    } // scramble(String str)
}
