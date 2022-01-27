package ch6;

class Car{
    String color;
    int door;

    Car() {} //빈 생성자로 생성 가능하게끔
    Car(String c,int d){ //생성자 넣고도 만들 수 있게뜸
        color = c;
        door =d;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color="red";
        c1.door=4;

        Car c2 = new Car("Blue",2);//더욱 간결한 코드가 된다!!!! 따라서 생성자를 만드는게 좋다
        System.out.println("C1 >> "+c1.color+"  "+c1.door);
        System.out.println("C2 >> "+c2.color+"  "+c2.door);
    }
}
