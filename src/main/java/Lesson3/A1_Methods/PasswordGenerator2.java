package Lesson3.A1_Methods;

import java.util.ArrayList;

public class PasswordGenerator2 {

    public void passGen () {

        // генерація із діапазона [Min, Max] ------ Min + (int)(Math.random() * ((Max - Min) + 1))

        int Min = 8;
        int Max = 15;

        String[] upper = {"A", "Q", "Z", "X", "W", "S", "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "T", "V", "Y", "U", "E", "I", "O"};
        String[] lower = {"a", "q", "z", "x", "w", "s", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "t", "v", "y", "i", "u", "e", "o"};
        String[] digits = {"0", "5", "4", "3", "1", "2", "6", "7", "8", "9"};

        String[] typeOfSymbol = {"Digits", "UpperC", "LowerC"};

        int passLength = Min + (int)(Math.random() * ((Max - Min) + 1));

        ArrayList<String> password = new ArrayList<>();

        for (int i = 0; i < passLength ; i++) {

            String symbType = typeOfSymbol[(0 + (int)(Math.random() * (((typeOfSymbol.length - 1) - 0) + 1)))];

            if (symbType.equals("Digits")) {
                int randDig = 0 + (int)(Math.random() * (((digits.length - 1) - 0) + 1));
                password.add(digits[randDig]);
            }
            else if (symbType.equals("UpperC")) {
                int randUpp = 0 + (int)(Math.random() * (((upper.length - 1) - 0) + 1));
                password.add(upper[randUpp]);
            }
            else {
                int randLow = 0 + (int)(Math.random() * (((lower.length - 1) - 0) + 1));
                password.add(lower[randLow]);
            }

        }

        System.out.println("\nYour new password - ");

        for (int j = 0; j < password.size(); j++) {

            System.out.print(password.get(j));

        }
        System.out.println("\n ");
    }

}
