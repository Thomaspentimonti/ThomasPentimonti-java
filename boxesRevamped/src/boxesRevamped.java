/*
 *****************************************************
 * Thomas Pentimonti
 * AP CS A
 * Period 1
 * October 1, 2018
 * Project  - Three Boxes
 *****************************************************
 */
public class boxesRevamped {

        public static void main(String[] args) {
            callBox(6, 4, '*');
            callBox(2, 4, '$');
            callBox(5, 4, '#');


        }
        public static void callBox (int height, int width, char character){
            for (int i = 1; i <= height; i++) {
                System.out.println(" ");

                for (int j = 1; j <= width; j++) {
                    System.out.print(character);
                }

            }

        }


}
