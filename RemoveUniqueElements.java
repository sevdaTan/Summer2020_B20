package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveUniqueElements {
    public static void main(String[] args) {

        // Find the Duplicates

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,1,3,4,6,5,5,4,6,8));

        list.removeIf(p -> Collections.frequency(list,p) == 1);
        System.out.println(list);

        System.out.println("======= first & last characters are same =======");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Meltem","Ali","Can","Nalan","Linda","David"));

        names.removeIf(p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));

        System.out.println(names);

        System.out.println("============");

         /*
        how many students made:
                A?
                B?
                C?
                D?
        how many failed?
        DO NOT use loop
         */

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(50,77,65,90,98,55,69,82,91,44,76,80,23));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p -> !(p >= 90 && p <= 100));// if grade is not >= 90, remove it
        System.out.println("Grade A: "+ gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p -> !(p >= 80 && p < 90));
        System.out.println("Grade B: "+ gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p -> !(p >= 70 && p < 80));
        System.out.println("Grade C:" + gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p -> !(p >= 60 && p < 70));
        System.out.println("Grade D: "+ gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p-> !(p >= 0 && p < 60));
        System.out.println("Grade F: " + gradeOfF);



    }
}
