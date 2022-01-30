package ch9;

class Person{
    long id;

    public boolean equals(Object obj){
        if(obj instanceof Person) return id ==((Person)obj).id;
        else return false;
    }
    Person(long id){
        this.id = id;
    }
}

public class EqualsEx1 {
    public static void main(String[] args) {
        Person p1 = new Person(1234567890L);
        Person p2 = new Person(1234567890L);

        if(p1==p2) System.out.println("SAME");
        else System.out.println("DIFF");

        if(p1.equals(p2)) System.out.println("SAME");
        else System.out.println("DIFF");
    }
}
