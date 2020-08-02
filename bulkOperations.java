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

        System.out.println("===== containsAll =======");

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //verify that 1,2,4 are contained in list2

        boolean r3 = list.containsAll (Arrays.asList(1,2,4));

        System.out.println("================ addAll ================");
        ArrayList<Integer> numbers = new ArrayList<>();

        // add: 30, 25, 40, 15, 55, 65, 75, 85, 95, 100
        /*
        Integer[] nums = {30, 25, 40, 15, 55, 65, 75, 85, 95, 100};
        numbers.addAll(  Arrays.asList(nums) );
         */

        numbers.addAll(  Arrays.asList(30, 25, 40, 15, 55, 65, 75, 85, 95, 100) );

        System.out.println(numbers);

        System.out.println();
        System.out.println("======= removeall =========");
        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,1,2,1,3,4,5,4,3,5,6,4,7));
        System.out.println(nums);
        // removeAll 1,2,4

        nums.removeAll(Arrays.asList(1,2,4));// it removes all the 1,2,4
        System.out.println(nums);//[3, 3, 5, 3, 5, 6, 7]

        nums.removeAll(Arrays.asList(3,5));
        System.out.println(nums);//[6, 7]
        System.out.println();
        System.out.println("====== retainAll (it removes NOT matching elements) =======");
        System.out.println();

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,2,3,4,5,6,7,6,7,5,4,4,3,3,2,1,1,2));
        System.out.println(num1);
// only keep the elements that are either 5,6,7

        num1.retainAll(Arrays.asList(5,6,7));
        System.out.println(num1);


    }
}
