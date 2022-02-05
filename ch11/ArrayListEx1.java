package ch11;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); //순서가 있고 중복을 허용한다.
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        System.out.println(list1);
        list1.add(0,000);
        System.out.println(list1);
        System.out.println("index >>"+ list1.indexOf(3));
        list1.remove(1);
        for(int i=0; i<list1.size();i++){
            System.out.print(list1.get(i)+" >> ");
        }
    }
}
