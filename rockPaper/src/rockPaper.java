import java.util.Random;
import java.util.Scanner;
public class rockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand= new Random();
        playGame();
    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to play a game? y/n -");
        String playGame = input.next();
        while(playGame.equals("y")){
            System.out.print("How many rounds? 3 or 5 -");
            int rounds = input.nextInt();
            for(int i = 1; i <= rounds; i++){
                System.out.print("rock, paper, or scissors?");
            }

        }
    }


}
