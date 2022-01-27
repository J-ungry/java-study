package ch6;

class Data1{ //생성자가 정의되지 않은 클래스
    int value;
}

class Data2{
    int value;
    Data2(int x){
        value = x; //매개변수가 있는 생성자
    }
}
class ConstuctorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); //생성자가 정의되지 않으면 컴파일러가 알아서 빈 생성자를 만듬
        Data2 d2 = new Data2(10); //매개변수를 채워줘야해서 생성자 만듬

        System.out.println(d1.value);
        System.out.println(d2.value);
    }
}
