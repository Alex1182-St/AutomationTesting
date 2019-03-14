package Lesson3.A1_Methods;

public class LuckyTickets {


    public void luckyTicCalc ( int minNumber, int maxNumber, int numberLength) {

       int calc=0;

        for (int i = minNumber; i <= maxNumber; i++) {
        int a = minNumber++;
        int temp1=0;
        int temp2=0;

        for (int j = 0; j <numberLength/2; j++) { //numberLength/2 -- чтобы брало только половину (в нашем случае три числа) из номера билета
            int b = a%10;
            temp1 = temp1+b;
            a = a/10;
        }

        a = a/1000; // чтобы отбросить уже посчитанные три числа вверху. 999555/1000 = 999 (числа после запятой отбрасываются в случае с int)
                    // 555 (их сума) уже посчитаны вверху.


        for (int j = 0; j <numberLength/2; j++) {
            int b = a%10;
            temp2 = temp2+b;
            a = a/10;
        }

        if (temp1 == temp2){
            calc++;
        }
    }
        System.out.println("\nQuantity of lucky tickets - " + calc);
}}



