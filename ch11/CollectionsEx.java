package ch11;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list,1,2,3,4,5);
        System.out.println(list);

        rotate(list,2);
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list,reverseOrder());
        System.out.println(list);

    }
}
