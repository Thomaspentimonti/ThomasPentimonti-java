public class distanceProject {
    public static void main(String[] args) {
        citydistance(16,10, 8, 28);
        System.out.println(answer);


    }

    public static int citydistance(int x1, int y1, int x2, int y2) {
        int answer = Math.subtractExact(x2,x1);
        return answer;





    }


}

/*
 *****************************************************
 * Thomas Pentimonti
 * AP CS A
 * Period 1
 * October 1, 2018
 * Project  - Three Boxes
 *****************************************************
 */
public class Boxes {

    public static void main(String[] args) {

        callBox(5,6);

    }
    public static void callBox(int height, int width){
        for (int i = 1; i <= height; i++) {
            System.out.println(" ");

            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }

        }
        for (int i = 1; i <= height; i++) {
            System.out.println(" ");

            for (int j = 1; j <= width; j++) {
                System.out.print("$");
            }

        }
        for (int i = 1; i <= height; i++) {
            System.out.println(" ");

            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }

        }
    }
}
