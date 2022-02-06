package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
            //이터레이터를 만들고 중간에 arr에 추가하거나 변경하면 에러가 발생한다
        }
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
//            한번만 출력되는 이유는 이터레이터는 일회용 이기 때문이다
//            만약 또 쓰고싶으면 it = list.iterator() 로 다시 불러와야 한다
        }
    }
}
