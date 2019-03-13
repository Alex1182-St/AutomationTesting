package Lesson3;

public class IntTask2 {

    public static void main(String[] args) {

        int minnumber = 1;
        int maxnumber = 9;
        int numberLength = 6;

        int a;

        for (int i = minnumber; i <= maxnumber; i++) {
              a = minnumber++;
            System.out.println("number-"+a);

            for (int j = 0; j <numberLength; j++) {
                int b = a%10;
                System.out.println(b);
                a = a/10;

        }}

    }}

