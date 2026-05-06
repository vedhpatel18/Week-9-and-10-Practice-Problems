/* 
@author Vedh
*/
import java.util.Scanner;

public class StringLengthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int length1 = getLength(str);
        int length2 = str.length();

        System.out.println("Length using method: " + length1);
        System.out.println("Length using built-in: " + length2);
    }

    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
}