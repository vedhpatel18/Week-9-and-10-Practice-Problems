/* 
@author Vedh
 */


import java.util.Scanner;

public class CharArrayProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] arr1 = getChars(str);
        char[] arr2 = str.toCharArray();

        boolean result = compareArrays(arr1, arr2);

        System.out.print("Characters using method: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + result);
    }

    static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}