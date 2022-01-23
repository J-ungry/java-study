package ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja"+"Va";
        String str = name + 8.0; //문자열과 double 의 결합으로 최종적으로 문자열이 된다

        System.out.println(name);
        System.out.println(str);
        System.out.println(7+' '); //' '는 문자열
        System.out.println(' '+7);
        System.out.println(7 + 7 + "");
        System.out.println(""+7 + 7); //이미 앞에서 문자열이 되었기 때문에 77이 된다
    }
}
