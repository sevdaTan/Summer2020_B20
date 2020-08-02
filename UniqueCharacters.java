package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
//DO NOT use nested Loop // use collection type
/*
1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D
 */
        String str = "ABABCDEE";

        ArrayList<Character> list = new ArrayList<>();

        for(char each : str.toCharArray()){//every single characters we have in the string
        list.add(each);
        }
        System.out.println(list);

        for (char each : list) {
            int count = Collections.frequency(list, each);
            if (count == 1) {
                System.out.println(each);
            }
        }
        /*
String str = "AABBCDDEAF";
        String uniques = "";

        ArrayList<String> list = new ArrayList<>();

        for(String each  : str.split("") ){
            list.add(each);
        }
        System.out.println(list);

        for( String each : list){
            int count = Collections.frequency(list, each);
            if(count == 1){
                uniques += each;
            }
        }
        System.out.println(uniques);

         */

    }
}
