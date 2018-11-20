public class Quadrant {
    public static void main(String[] args) {
        String x = findQuad(1.0, 1.0);
        System.out.println(x);


    }

    public static String findQuad(double x, double y) {

        if(x > 0 && y > 0) {
            return  "Quadrant One";
        }else if(x < 0 && y > 0) {
            return "Quadrant Two";
        }else if(x < 0 && y < 0 ) {
             return "Quadrant Three";
        }else if(x > 0 && y < 0) {
            return "Quadrant Four";
        }else{
            return "0";
        }


    }

}
