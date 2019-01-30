import java.util.*;
public class fracCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter something, or type quit to quit");
        String calcInput = input.next();
        String calcInputtwo = input.next();
        String calcInputthree = input.next();
        String[] terms = new String[3];


        if (!input.equals("quit")) {
            System.out.println(calcInput + "\n" + calcInputtwo + "\n" + calcInputthree);
            System.out.println(parseWhole("45/678"));
            System.out.println(parseNum("45/98"));
            System.out.println(parseDem("45/98"));
        }
        if(symbol == "+"){
            int numOne = parseNum(terms[0])*parseDem(terms[3]);
            int numTwo = parseDem(terms[0])*parseNum(terms[3]);
        }

    }

    public static int parseWhole(String number) {
        int j = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '_') {
                return Integer.parseInt(number.substring(0, i));
            } else if (number.charAt(i) == '/') {
                j++;
            }
        }
        if (j == 0) {
            return Integer.parseInt(number);
        }
        return 0;

    }

    public static int parseNum(String number) {
        int i = 0;
        int j = 0;
        for (int n = 0; n < number.length(); n++) {
            if (number.charAt(n) == '_') {
                j = n;
                i++;
            }
            if (number.charAt(n) == '/' && i == 1) {
                return Integer.parseInt(number.substring(j + 1, n));
            }
            if (number.charAt(n) == '/' && i == 0) {
                return Integer.parseInt(number.substring(j, n));
            }
        }
        return 0;

    }

    public static int parseDem(String number) {
        int i = 0;
        int j = 0;
        for (int n = 0; n < number.length(); n++) {
            if (number.charAt(n) == '_') {
                i++;
            }
            if (number.charAt(n) == '/') {
                j++;
                return Integer.parseInt(number.substring(n + 1));
            }
            if (i == 1 && j == 1) {
                return 1;
            }
        }
        return 1;

    }
}