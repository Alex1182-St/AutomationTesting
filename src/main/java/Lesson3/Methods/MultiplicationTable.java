package Lesson3.Methods;

public class MultiplicationTable {

    public void multTable (int number) {

        for (int i =0; i<=9; i++) {

            int a = number*i;

            System.out.println("\n" + number + "*" + i + "=" +a);
        }
    }

}
