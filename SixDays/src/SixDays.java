/*
 *****************************************************
 * Thomas Pentimonti
 * AP CS A
 * Period 1
 * September 12, 2018
 * Project #1 - SixDays of Xmas
 *****************************************************
 */
public class SixDays {
    //printing verse one
    public static void verseOne(){
        System.out.println("a partridge in a pear tree.");
    }
    //prints verse two, then calls verse one
    public static void verseTwo(){
        System.out.println("two turtle doves, and");
        verseOne();
    }
    //prints verse three, then calls last verse, which calls first verse
    public static void verseThree(){
        System.out.println("three French hens,");
        verseTwo();
    }
    //this continues for the rest of the song
    public static void verseFour(){
        System.out.println("four calling birds,");
        verseThree();
    }
    public static void verseFive(){
        System.out.println("five golden rings,");
        verseFour();
    }
    public static void verseSix(){
        System.out.println("six geese a-laying,");
        verseFive();
    }
    //each statement is added above the verse these are methods for each statment
    public static void statementOne(){
        System.out.println("On the 1st day of \"Xmas\" my true love gave to me");
    }
    public static void statementTwo(){
        System.out.println();
        System.out.println("On the 2nd day of \"Xmas\" my true love gave to me");
    }
    public static void statementThree(){
        System.out.println();
        System.out.println("On the 3rd day of \"Xmas\" my true love gave to me");
    }
    public static void statmentFour(){
        System.out.println();
        System.out.println("On the 4th day of \"Xmas\" my true love gave to me");
    }
    public static void statementFive(){
        System.out.println();
        System.out.println("On the 5th day of \"Xmas\" my true love gave to me");
    }
    public static void statementSix(){
        System.out.println();
        System.out.println("On the 6th day of \"Xmas\" my true love gave to me");
    }
    public static void main(String[] args){
        statementOne(); //places xmas statement above verse
        verseOne(); //first verse
        statementTwo();
        verseTwo();
        statementThree();
        verseThree();
        statmentFour();
        verseFour();
        statementFive();
        verseFive();
        statementSix();
        verseSix();


    }
}
