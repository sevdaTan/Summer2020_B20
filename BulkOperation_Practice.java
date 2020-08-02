package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Sevda");
        students.add("Busra");
        students.add("Kevser");
        students.add("Quyen");
        students.add("Jika");

        // verify that the names Ulku, Ayse are contained or not

       boolean r1 = students.containsAll(Arrays.asList("Ulku", "Ayse"));

        System.out.println(r1);

        System.out.println("===============");

        ArrayList<String> group14 = new ArrayList<>();

        group14.addAll(Arrays.asList("Sevda","Busra","Jika","Fatih","Sardor","Samir"));

        boolean result = group14.containsAll(Arrays.asList("Muhtar","Asiya","Kuzzat"));
        System.out.println(result);






    }
}
