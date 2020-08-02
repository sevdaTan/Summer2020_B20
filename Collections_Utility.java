package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(24,2,34,55,64,32,12,-98,-56,455));

        //maximum number
       Integer max = Collections.max(list);

        //minimum number
        Integer min = Collections.min(list);

        System.out.println("Maximum Number: "+ max);
        System.out.println("Minimum Number: "+ min);
        System.out.println("==========");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Muhtar","Asiya","Muhtar","Saim","Guljannat","Kuzzat"));

        //replaceAll
        Collections.replaceAll(names,"Muhtar", "Sevda");

        System.out.println(names);

    }
}
