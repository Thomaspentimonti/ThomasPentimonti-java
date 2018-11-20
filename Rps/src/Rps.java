import java.util.Random;
import java.util.Scanner;    
    public class Rps
    {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Would you like to play rock paper scissors? (y/n)");
            String gameAnswer = input.next();
            System.out.println("How many rounds?");
            int roundCount = input.nextInt();
            System.out.print("What is your name? - ");
            String playerName = input.next();
            while(gameAnswer.equals("y")) {
                for(int i = 1; i <= roundCount; i++){
                    System.out.println("ROUND " + i);
                    int playerChoice = playerChoiceToAnswer();
                    int computerChoice = rand.nextInt(3);
                    playGame(computerChoice, playerChoice, playerName);
                }
                System.out.println("Would you like to play again? (y/n)");
                gameAnswer = input.next();
            }
        }
        public static int playerChoiceToAnswer(){
            Scanner input = new Scanner(System.in);
            System.out.print("What is your choice: ROCK, PAPER, or SCISSORS - ");
            String ChoiceAnswer = input.next();
            if (ChoiceAnswer.equals("ROCK")) {
                return 0;
            } else if (ChoiceAnswer.equals("PAPER")) {
                return 1;
            } else if (ChoiceAnswer.equals("SCISSORS")){
                return 2;
            } else {
                return 3;
            }
        }
        public static void playGame(int computerChoice1, int playerChoice1, String playerName1){
            if (computerChoice1 == playerChoice1) {
                System.out.println("It's a tie!\n");
            } else if (computerChoice1 == 0 && playerChoice1 == 2) {
                System.out.println("The computer chose ROCK, beating " + playerName1 + "'s SCISSORS\n");
            } else if (computerChoice1 == 0 && playerChoice1 == 1) {
                System.out.println("The computer chose ROCK, losing to " + playerName1 + "'s PAPER\n");
            } else if (computerChoice1 == 1 && playerChoice1 == 0) {
                System.out.println("The computer chose PAPER, beating " + playerName1 + "'s ROCK\n");
            } else if (computerChoice1 == 1 && playerChoice1 == 2) {
                System.out.println("The computer chose PAPER, losing to " + playerName1 + "'s SCISSORS\n");
            } else if (computerChoice1 == 2 && playerChoice1 == 1) {
                System.out.println("The computer chose SCISSORS, beating " + playerName1 + "'s PAPER\n");
            } else if (computerChoice1 == 2 && playerChoice1 == 0) {
                System.out.println("The computer chose SCISSORS, losing to " + playerName1 + "'s ROCK\n");
            } else if (playerChoice1 == 3){
                System.out.println("Please make a valid choice");
            }
        }
    }

