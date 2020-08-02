package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
        boolean r1 = list.contains(1); // true
        System.out.println(r1);

        ArrayList<Integer> elements = new ArrayList<>();
            elements.add(1);
            elements.add(2);
            elements.add(4);//true
        //elements.add(5); // it returns false
        boolean r2 = list.containsAll(elements);

        System.out.println(r2);

        System.out.println("============");

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //verify that 1,2,4 are contained in list2

        boolean r3 = list.containsAll (Arrays.asList(1,2,4));

    }
}
