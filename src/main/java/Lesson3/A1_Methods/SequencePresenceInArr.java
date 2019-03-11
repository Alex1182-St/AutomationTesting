package Lesson3.A1_Methods;

import java.util.ArrayList;

public class SequencePresenceInArr {

    public void sequencePresence (ArrayList<Integer> arr, ArrayList<Integer> sequence) {

        for (int i = 0; i <= arr.size() - sequence.size() ; i++) {

            ArrayList<Integer> arrSequence = new ArrayList<Integer>();

            for (int j = 0; j < sequence.size(); j++) {

                arrSequence.add(arr.get(i + j));
            }
            if (sequence.equals(arrSequence))  {

                System.out.println("\nTrue " + sequence + " is present in " + arr);

            }


    }}}



