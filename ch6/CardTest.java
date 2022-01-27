package ch6;

class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number =10;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("C1 >>"+c1.kind+" , "+c1.number+
                "  Width, Height >> "+c1.width+" , "+c1.height);
        System.out.println("C2 >>"+c2.kind+" , "+c2.number+
                "  Width, Height >> "+c2.width+" , "+c2.height);

        //클래스 변수의 값을 변경 (모든 인스턴스에게 공통 적용)
        Card.width = 200;
        Card.height = 300;

        System.out.println("C1 >>"+c1.kind+" , "+c1.number+
                "Width, Height >> "+c1.width+" , "+c1.height);
        System.out.println("C2 >>"+c2.kind+" , "+c2.number+
                "  Width, Height >> "+c2.width+" , "+c2.height);
    }
}

class Card{
    //인스턴스 변수(개별적인 값)
    String kind;
    int number;

    //클래스 변수 (고유한 값)
    static int width = 100;
    static int height = 250;
}
