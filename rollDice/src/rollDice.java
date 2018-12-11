import java.util.*;
public class rollDice {
    public static final int DICENUM = 1;
    public static void main(String[] args) {
        Scanner sentinel = new Scanner(System.in);
        System.out.println("would you like to play? yes/no");
        String x= sentinel.next();
        defDice();
        printDice();
        while (x.equals("yes")){
            System.out.println(rollDice());
            printDice();
            drawLine();
            System.out.println("would you like to play again? yes/no");
            x = sentinel.next();

        }


    }
    public static void defDice(){
        String dice [][]= new String[6][5];
        String gameDice[][]=new String[DICENUM][5];

    }
    public static void printDice(){
        System.out.println("printDice");

    }
    public static int rollDice(){
        Random rand = new Random();
        return rand.nextInt(6)+1;

    }
    public static void drawLine(){
        System.out.println("-------");

    }
}

for (i=0; i<DICENUM; i++)