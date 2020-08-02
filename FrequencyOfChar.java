package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChar {
    public static void main(String[] args) {
//DO NOT use nested Loop
/*
 2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2
 */

        String str = "AABBBBBCCDDDDEE";

        ArrayList<String> list = new ArrayList<>();

        for (String each : str.split("")){
            list.add(each);
        }

        System.out.println(list);

        String nondup = Util.removeDup(str);// ABCDE ==> avoid duplication

        for(String each : nondup.split("")) { // each : A,B,C,D,E
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
            System.out.println();
        }

    }
}
