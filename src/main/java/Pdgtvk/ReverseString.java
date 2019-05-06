package Pdgtvk;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ReverseString {

    public static void main(String[] args) {

        String s ="Strr";

        char [] chars = s.toCharArray();
        System.out.println(chars);

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < chars.length ; i++) {
            arr.add(chars[i]);
        }

        Collections.reverse(arr);
        System.out.println(arr);


        LinkedHashSet set = new LinkedHashSet(arr);
        System.out.println(set);


    }
}
