/*
 *****************************************************
 * Thomas Pentimonti
 * AP CS A
 * Period 1
 * October 1, 2018
 * Project#2 Rocket Ship
 *****************************************************
 */

public class rocketShip {

    public static void main(String[] args) {
        drawconeFirst();

        //drawconeSecond();
    }

    public static void drawBoxOne() {

        for (int i =1; i <= 3; i++) {
            System.out.print("");
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
                System.out.print("\\");

                }
            }
        }

        public static void drawconeSecond(){
        for (int i = 1; i<=6; i++){
            System.out.println(" ");
            for (int j = 1; j<=i; j++){
                System.out.print("\\");
            }
        }
        public static void drawconeFirst(){
        for (int i = 1; i<=6; i-- ) {
            System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("/");
        }
        }
    }
}

