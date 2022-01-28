package ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);

        t.setHour(t.getHour()+1); //클래스 안에서 메서드를 통해서만 접근할 수 있음 t.hour =13 이렇게 하면 에러가 난다
        System.out.println(t);
    }
}

class Time{
    private int hour,minute,second;

    Time(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public int getHour(){return hour;}
    public void setHour(int hour){ //시의 범위를 확인해주는
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute(){return minute;}
    public void setMinute(int minute){
        if(minute<0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond(){return second;}
    public void setSecond(int second){
        if(second <0 || second > 59) return;
        this.second = second;
    }
    public String toString(){
        return hour+":"+minute+":"+second;
    }
}
