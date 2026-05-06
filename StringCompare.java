/* 
@author Vedh
 */
import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean resultCharAt = compareStrings(s1, s2);
        boolean resultEquals = s1.equals(s2);

        System.out.println("Result using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);

        if (resultCharAt == resultEquals) {
            System.out.println("Both results are the same");
        } else {
            System.out.println("Results are different");
        }
    }

    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}