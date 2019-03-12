package Lesson3.A1_Methods;

public class LongestWord {

    public void longWord (String a) {

        String [] words = a.split(" "); // разделяю строку на масив слов
        String theLongest = " ";

        for (int i = 0; i < words.length ; i++) {

            if (words[i].length() >= theLongest.length()) {
                theLongest = words [i];
            }
        }
        System.out.println("\n Your input string is \n" +
                "" + a);
        System.out.println("\n Longest word is " + theLongest);
    }

}
