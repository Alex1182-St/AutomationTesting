package Lesson3.Methods;

public class AdjacentDigits {

    public void adjDigsProduct (String number, int digsQty) {

        long maxProduct = 0;
        String strWithMaxProduct = null;

        for (int i = 0; i < number.length() - digsQty ; i++) {

        int product = 1;
        for (int j = 0; j < digsQty; j ++) {

            if (Character.getNumericValue(number.charAt(i + j))!=0) {
            product = product * Character.getNumericValue(number.charAt(i + j)); // увага на цей момент - i + j
            }

            if (product > maxProduct) {
                maxProduct = product;
                strWithMaxProduct = number.substring(i, i+digsQty);

            }
        }
        }
        System.out.println("\n Max product of adjacent is " + maxProduct);
        System.out.println("\n Adjacement digits are " + strWithMaxProduct);
        }
        }