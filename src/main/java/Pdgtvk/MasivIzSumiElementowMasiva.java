package Pdgtvk;

import java.util.ArrayList;

public class MasivIzSumiElementowMasiva {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array.add(1);
        array.add(3);

        array.add(5);
        array.add(7);

        array.add(8);
        array.add(10);


        for (int i = 0; i < array.size() ; i=i+2) {
           int temp1 = array.get(i);
           int temp2 = array.get(i+1);
           int temp = temp1 + temp2;

                array2.add(temp);

        }

        System.out.println(array2);
        }
}
