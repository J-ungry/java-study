package ch6;

class MyMath2 {
    long a,b;

    long add(){ //인스턴스 메서드
        return a+b; //인스턴스 변수를 사용
    }

    static long add(long a, long b){ //클래스메서드 (static method)
        return a+b; // 지역변수 사용
    }
}

class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,200L)); //클래스 메서드는 별도의 인스턴스 호출 없이 사용 ㅇ
        MyMath2 mm = new MyMath2();//인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add());//인스턴스 메서드 호

    }
}
