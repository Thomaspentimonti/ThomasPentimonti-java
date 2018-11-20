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
    public static final int SIZE =5;
    public static void main(String[] args) { //Prints the rocket
        cone();
        line();
        topSection();
        line();
        bottomSection();
        line();
        cone();
    }

    public static void topSection() { //Combines cone methods to make one design inside top section
        upDesign();
        downDesign();
    }

    public static void bottomSection() { //Combines methods in a different order to make a different design in the bottom section
        downDesign();
        upDesign();
    }

    public static void upDesign() { //prints inside design facing up
        for(int i = 1; i <= SIZE; i++) {
            System.out.print("|");
            for(int b = 1; b <= 2; b++) {
                for(int j = i; j < SIZE; j++) {
                    System.out.print(".");
                }
                for(int j = 1; j <= i; j++) {
                    System.out.print("/\\");
                }
                for(int j = i; j < SIZE; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }

    public static void downDesign() { //prints inside design facing down
        for(int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for(int b = 1; b <= 2; b++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(".");
                }
                for(int j = i; j < SIZE; j++) {
                    System.out.print("\\/");
                }
                for(int j = 1; j <= i; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }

    public static void line() {  //prints line
        System.out.print("+");
        for(int i = 1; i <= (SIZE * 2); i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void cone() {   //prints the cone at the top and bottom
        for(int j = 1; j <= (SIZE * 2 - 1); j++) {
            for(int i = j; i <= (SIZE * 2 - 1); i++) {
                System.out.print(" ");
            }
            for(int i = 1; i<= j; i++) {
                System.out.print("/");
            }
            System.out.print("**");
            for(int i = 1; i <= j; i++) {
                System.out.print("\\");
            }
            System.out.println(" ");
        }
    }

}

