package Pdgtvk;

public class LoopWork {

    public void loopWorkExample () {

        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }}
