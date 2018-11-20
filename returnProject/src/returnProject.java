public class returnProject {
    public static void main(String[] args) {
        double result=min(1,3, 5);
        System.out.println(result);

    }

    public static double min(int x1, int y1, int x2) {
        double small=Math.min(Math.min(x1, y1),x2);
        double large=Math.max(Math.max(x1, y1),x2);
        double answer=Math.sqrt((large+small));
        return answer;
    }



}
