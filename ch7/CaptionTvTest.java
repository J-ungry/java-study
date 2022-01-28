package ch7;

class Tv{
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv{
    boolean caption; //새로 추가해줌 Tv의 모든것들은 사용 가능
    void displayCaption(String text){
        if (caption){//caption 이 true 라면
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; //별도로 channel 을 만들지 않았지만 동작을 한다
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World!");
        ctv.caption = true;
        ctv.displayCaption("Hello World");
    }
}
