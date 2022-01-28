package ch7;

class Product{
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv2 extends Product{
    Tv2(){
        super(100);//조상클래스의 생성자 price를 호출
    }
    public String toString(){return "Tv";}//toString 은 조상조상인 object에 정의된거임 그거 오버라이딩 한거임
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if (money < p.price){
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+" 를 구매!");
    }
}
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv2());
        b.buy(new Computer());

        System.out.println(b.money+" 원 보유중");
        System.out.println(b.bonusPoint+" 보너스 보유중");
    }
}
