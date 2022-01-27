package ch6;

class Car2{
    String color;
    int door;

    Car2() {
        this("white",4); //빈 생성자로 하면 이렇게 되는건가 ?? -> 맞네 !

    } //빈 생성자로 생성 가능하게끔
    Car2(String color,int door){ //생성자 넣고도 만들 수 있게뜸
        this.color = color;
        this.door =door;
    }//this , this() 는 완전 다른거다!!!!
}
public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();

        Car2 c2 = new Car2("Blue",2);//더욱 간결한 코드가 된다!!!! 따라서 생성자를 만드는게 좋다
        System.out.println("C1 >> "+c1.color+"  "+c1.door);
        System.out.println("C2 >> "+c2.color+"  "+c2.door);
    }
}


