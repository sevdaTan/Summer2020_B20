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
        System.out.println(group14);
        boolean result = group14.containsAll(Arrays.asList("Muhtar","Asiya","Kuzzat"));
        System.out.println(result);

        System.out.println("======================= retainAll =================");

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed") );

        System.out.println(employees);

        employees.retainAll(  Arrays.asList("Ahmed", "Dawud")  );
        System.out.println(employees);

        System.out.println("====================== removeAll ==================");

        ArrayList<String> employees2 =new ArrayList<>();
        employees2.addAll( Arrays.asList( "Ahmed", "Muhtar", "Ahmed", "Virginia", "Beslan", "Ibrahim", "Ahmed") );

        System.out.println(employees2);

        employees2.removeAll(  Arrays.asList("Ahmed")  );
        System.out.println(employees2);

    }
}
