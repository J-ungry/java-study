package ch2;

public class Printex1 {
    public static void main(String[] args) {
        //println 과 printf 의 차이
        //printf 는 자동 줄바꿈이 되지 않으며
        //printf 에서는 지시자를 이용할 수 있다 println 은 그대로 출력이 된다
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%b%n",b);
        System.out.printf("s=%d%n",s);
        System.out.printf("c=%c,  %d  %n",c,(int)c);
        System.out.printf("finger=[%5d]%n",finger);
        System.out.printf("finger=[%-5d]%n",finger);
        System.out.printf("finger=[%05d]%n",finger);
        System.out.printf("big=%d%n",big);
        System.out.printf("hex=%#x%n",hex);
        System.out.printf("octNum=%o,  %d%n",octNum,octNum);
        System.out.printf("hexNum-%x,  %d%n",hexNum,hexNum);
        System.out.printf("binNum=%s,  %d%n",Integer.toBinaryString(binNum),binNum);
    }
}
