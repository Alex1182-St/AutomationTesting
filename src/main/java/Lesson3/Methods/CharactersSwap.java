package Lesson3.Methods;

public class CharactersSwap {


    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public CharactersSwap() {
    }

    public void CharSwap () {

        System.out.println("\nYour string is " + s);

        char[] arrayChar0 = s.toCharArray(); // строку в массив

        char[] arrayChar1 = s.toCharArray();

        char[] arrayChar2 = s.toCharArray();


        arrayChar2[0]=arrayChar0[arrayChar0.length-1];

        arrayChar2[arrayChar2.length-1]=arrayChar1[0];


        String s2 = new String(arrayChar2); //массив в строку

        System.out.println("\nNew string is " + s2);

    }
}
