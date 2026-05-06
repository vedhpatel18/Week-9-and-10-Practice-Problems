
/* 
@author Vedh
 */
import java.util.Scanner;

public class SplitProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");

        boolean result = compareArrays(arr1, arr2);

        System.out.print("Words using method: ");
        for (String w : arr1) {
            System.out.print(w + " ");
        }
        System.out.println();

        System.out.print("Words using split(): ");
        for (String w : arr2) {
            System.out.print(w + " ");
        }
        System.out.println();

        System.out.println("Are both arrays equal? " + result);
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

    static String[] splitText(String text) {

        int len = getLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount - 1];
        int k = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            int end = spaceIndex[i];
            String w = "";
            for (int j = start; j < end; j++) {
                w += text.charAt(j);
            }
            words[i] = w;
            start = end + 1;
        }

        String last = "";
        for (int j = start; j < len; j++) {
            last += text.charAt(j);
        }
        words[wordCount - 1] = last;

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }
}