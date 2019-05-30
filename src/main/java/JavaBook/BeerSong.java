package JavaBook;

public class BeerSong {

    public static void main(String[] args) {

        int beerNum = 99;
        String word = "пляшок (пляшки)";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "пляшка";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стіні");
                System.out.println(beerNum + " " + word + " пива");
                System.out.println("Візьми одну");
                System.out.println(("Пусти по колу"));
                beerNum = beerNum -1;

            }
            else {
                System.out.println("Немає пляшок пива на стіні");
            }
        }
    }

}
