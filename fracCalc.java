import java.util.*;
public class fracCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("enter something, or type quit to quit");
            String calcInput = input.next();
            String calcInputtwo = input.next();
            String calcInputthree = input.next();
            String[] terms = new String[3];
            terms[0] = calcInput;
            terms[1] = calcInputtwo;
            terms[2] = calcInputthree;

            double newNumeratorOne = parseWhole(terms[0]) * parseDem(terms[0]) + parseNum(terms[0]);
            double newNumeratorTwo = parseWhole(terms[2]) * parseDem(terms[2]) + parseNum(terms[2]);
            double AD = newNumeratorOne * parseDem(terms[2]);
            double BC = parseDem(terms[0]) * newNumeratorTwo;
            double BD = parseDem(terms[0]) * parseDem(terms[2]);
            double AC = newNumeratorOne * newNumeratorTwo;
            double ADplusBC = AD + BC;
            double ADminusBC = AD - BC;

            if (terms[1].equals("+")) {
                System.out.println(ADplusBC / BD);
            }
            if (terms[1].equals("-")) {
                System.out.println(ADminusBC / BD);
            }
            if (terms[1].equals("*")) {
                System.out.println(AC / BD);
            }
            if (terms[1].equals("/")) {
                System.out.println(AD / BC);
            }

        }

    }
    public static int parseWhole(String number){
        int j = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '_') {
                return Integer.parseInt(number.substring(0, i));
            } else if(number.charAt(i) == '/') {
                j++;
            }
        }
        if(j == 0){
            return Integer.parseInt(number);
        }
        return 0;

    }
    public static int parseNum(String number){
        int i = 0;
        int j = 0;
        for (int n = 0; n < number.length(); n++){
            if (number.charAt(n) == '_'){
                j = n;
                i++;
            }
            if (number.charAt(n) == '/' && i == 1){
                return Integer.parseInt(number.substring(j + 1, n));
            }
            if (number.charAt(n) == '/' && i == 0){
                return Integer.parseInt(number.substring(j, n));
            }
        }
        return 0;

    }
    public static int parseDem(String number){
        int i = 0;
        int j = 0;
        for (int n = 0; n < number.length(); n++){
            if (number.charAt(n) == '_'){
                i++;
            }
            if (number.charAt(n) == '/'){
                j++;
                return Integer.parseInt(number.substring(n + 1));
            }
            if (i == 1 && j == 1){
                return 1;
            }
        }
        return 1;

    }
}
