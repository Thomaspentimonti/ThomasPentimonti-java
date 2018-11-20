/*
 *****************************************************
 * Thomas Pentimonti
 * AP CS A
 * Period 1
 * October 24, 2018
 * Project Distance lab
 *****************************************************
 */
public class Distance {
    public static void main(String[] args) {
        double resultOne=distanceOne(16,10,4,28); //Input for Tacoma to Gig Harbor
        System.out.println("The distance from Gig Harbor to Tacoma is " + resultOne);
        double resultTwo=distanceOne(4, 28, 2, 8); //Input for Gig Harbor to Steilacoom
        double resultThree= resultOne+resultTwo; //Adds the distance from Tacoma to Gig Harbor to Gig Harbor to Steilacoom
        System.out.println("The distance from Tacoma to Steilacoom through Gig Harbor is " + resultThree);
        double resultFour=distanceOne(2,8, 10, 3); //input from Steilacoom to Spanaway
        double resultFive=resultThree+resultFour; // adds the final distance
        System.out.println("The distance to Spanaway from Steilacoom is "+ resultFive);
    }

    public static double distanceOne(double x1, double y1, double x2, double y2) {
        double sumOne=x2-x1;
        double powOne=Math.pow(sumOne, 2);
        double sumTwo=y2-y1;
        double powTwo=Math.pow(sumTwo, 2);
        double underBracket=powOne+powTwo;
        double answer=Math.sqrt(underBracket);
        return answer;
    }
}
