package Lesson3.A1_Methods;

public class Smile {

        private boolean heSmile;
        private boolean sheSmile;

        public boolean isHeSmile() {
        return heSmile; }

        public void setHeSmile(boolean heSmile) {
        this.heSmile = heSmile; }

        public boolean isSheSmile() {
        return sheSmile; }

        public void setSheSmile(boolean sheSmile) {
        this.sheSmile = sheSmile; }

        public Smile(){}


        public void  visitCinema (boolean heSmile, boolean sheSmile)
        {


            if ((heSmile == true) && (heSmile == sheSmile)) {

                System.out.println("\nThey have the same mood (they smile) and want to go to the cinema");

            }
            else if ((heSmile == false) && (heSmile == sheSmile)) {

                System.out.println("\nThey have the same mood (they do not smile) and do not want to go to the cinema");
            }
            else if ((heSmile == true) && (sheSmile == false)) {
                System.out.println("\nThey have different mood (she does not smile) and do not go to the cinema");

            }
            else {
                System.out.println("\nThey have different mood (he does not smile) and do not go to the cinema");

            }
        }
    }


