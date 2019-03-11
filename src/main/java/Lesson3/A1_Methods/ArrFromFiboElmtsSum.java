package Lesson3.A1_Methods;

import java.util.ArrayList;

public class ArrFromFiboElmtsSum {

    public long arrSum (ArrayList<Long> arr) {

        long sum = 0;

        for (int i=0; i <arr.size(); i++){
            sum = sum+arr.get(i);
        }
        return sum;

    }

}
