package ch6;

class Tv{
    //Tv의 속성 (멤버변수)
    String color;
    boolean power;
    int channel;

    //Tv의 기능 (method)
    void power() {power = !power;} //전원 켜거나 끄거나
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        t1.channel = 7;
        t1.channelDown();

        System.out.println("T1 channel >> "+t1.channel);

        Tv t2 = new Tv();
        t2.channel = 8;
        t2.channelUp();
        System.out.println("T2 channel >>"+t2.channel);

        t2 = t1; //t2를 가르키고 있었던걸 t1으로 옮긴다 따라서 t2 의 주소는 더이상 사용할 수 없음
        System.out.println("T2 channel >> "+t2.channel);
    }
}
