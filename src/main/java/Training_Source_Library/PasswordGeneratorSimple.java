package Training_Source_Library;

import java.util.ArrayList;

public class PasswordGeneratorSimple {

    public void passGen () {

        // генерація із діапазона [Min, Max] ------ Min + (int)(Math.random() * ((Max - Min) + 1))

        int Min = 8;
        int Max = 15;

        int passLength = Min + (int)(Math.random() * ((Max - Min) + 1));

        String[] symbols = {"A", "a", "1", "Q", "q", "z", "0", "Z", "x", "X", "W", "w", "S", "s", "B", "b", "C", "c",
                            "D", "d", "f", "F", "G", "g", "H", "9", "8", "7", "6", "h", "j", "J", "K", "L", "k", "l",
                            "m", "n", "M", "N", "P", "p", "r", "R", "t", "T", "V", "v", "Y", "y", "U", "i", "E", "I",
                            "u", "e", "O", "o", "2", "3", "4", "5"};

        ArrayList<String> password = new ArrayList<>();

        for (int i = 0; i < passLength ; i++) {

            int random = 0 + (int)(Math.random() * (((symbols.length - 1) - 0) + 1));
            password.add(symbols[random]);
        }

        System.out.println("\nYour new password - ");

        for (int j = 0; j < password.size(); j++) {

            System.out.print(password.get(j));

        }
        System.out.println("\n ");
    }

}
