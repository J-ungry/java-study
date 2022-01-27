package ch6;

class Document{
    static int count = 0; //클래스 변수 (고유한 값)
    String name; //인스턴스 변수 (개별적인 값)

    Document(){
        this("제목없음"+ ++count);
    }//생성자를 지정하지 않았을때
    Document(String name){
        this.name = name;
        System.out.println("문서 "+this.name+" 가 생성되었습니다");
    }
}
public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바의 정석");
        Document d3 = new Document();

    }
}
