package ch6;

class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L,6L);
        long result2 = mm.sub(5L,6L);
        long result3 = mm.multi(5L,6L);
        double result4 = mm.divide(5L,6L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}

class MyMath{
    long add(long a,long b){ //메서드의 선언 (메소드는 클래스 안에만 선언 가능하다)
        long result = a+b;
        return result;
    }
    long sub(long a,long b) {return a-b;}
    long multi(long a,long b) {return a*b;}
    double divide(double a,double b){
        return a/b;
    }
}
