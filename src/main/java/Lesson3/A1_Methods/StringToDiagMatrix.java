package Lesson3.A1_Methods;

public class StringToDiagMatrix {

    public void stringToMatrix (String ourString) {

        char [] fromString = ourString.toCharArray();

        String s = " ";
        String w = "  ";

        for (int i = 0; i < fromString.length ; i++) {

            System.out.println(s + fromString[i]);

            s = s + w;

        }
    }
}
