package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        //removeIf() == removes the elements that are matchig with the if condition
        System.out.println("===== -> Lambda expression ====");
        ArrayList<Integer> list  = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,2,1,2,1,3,4,5,6,7,6,5,7,8));

        //Predicate<Integer> lessThan5 = p -> p < 5; // p == integer
        //list.removeIf(lessThan5);

        list.removeIf(p -> p < 5);
        System.out.println(list);

        System.out.println("===== remove all the odd / even numbers from the arrayList =====");

        Predicate<Integer> oddNums = p -> p %2 != 0;
        ArrayList<Integer> numbers  = new ArrayList<>();

        for (int i = 0; i <= 100; i++){
            numbers.add(i);
        }
        numbers.removeIf(oddNums);
        numbers.removeIf(p -> p %2 == 0); // remove if the number is even

        System.out.println(numbers);

        System.out.println("==========");

        ArrayList<String> names  = new ArrayList<>();
        names.addAll(Arrays.asList("Sevda","Mustafa","Busra","Mehmet","Emrah","Meltem","Kevser"));
        names.removeIf(each -> each.startsWith("M"));
        names.removeIf(each -> each.startsWith("E") && each.endsWith("h"));

        System.out.println(names);

        System.out.println("===== uniques with Lambda======");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,3,2,1,4,5,6,7,8,7,6,5,9));

        nums.removeIf(p -> Collections.frequency(nums, p) != 1 );
                               // for the elements that are not unique

        System.out.println(nums);

        System.out.println("====== remove digits and letters from the arrayList =====");

        ArrayList<Character> chars = new ArrayList<>();




    }
}
