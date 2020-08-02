package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitsLetters {
    public static void main(String[] args) {

        System.out.println("====== remove digits and letters from the arrayList =====");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','@','t','j','a','3','#','>','y','*','$','^','l'));

         chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(chars);

        System.out.println("======= write the lists seperately as letters, digits and chars  ==========");

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('6','a','@','t','j','a','3','#','>','y','*','$','^','l'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list);
        digits.removeIf(d -> !Character.isDigit(d));// if the character is not digit, remove it
        System.out.println("Digits are: "+digits);

        ArrayList<Character> letters = new ArrayList<>();
        digits.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p));// if the character is not letter, remove it
        System.out.println("Letters are: "+letters);

        ArrayList<Character> ch = new ArrayList<>();
        ch.addAll(list);
        ch.removeAll(letters);
        ch.removeAll(digits);
        System.out.println("Characters are: "+ch);




    }
}
