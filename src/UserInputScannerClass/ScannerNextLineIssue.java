package UserInputScannerClass;

import java.util.Scanner;

/*When you use nextInt() and then immediately use nextLine(),
the nextLine() might return an empty string — and it feels like it "skipped" your input.
Or that it did not read the input String value completely.
 */
// nextInt() reads the integer only (e.g., 42), but leaves the newline character (\n) behind in the buffer.
// nextLine() reads up to the next newline, so it ends up reading that leftover newline instead of the actual next line of input.
// Solution : Add a dummy nextLine() after nextInt() - DEMONSTRATED BELOW
public class ScannerNextLineIssue {

    public static void main(String[] args) {

        // Trying this with no dummy next line first.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int value");
        int i = scan.nextInt();
        System.out.println("Enter double value");
        double d = scan.nextDouble();
        System.out.println("Enter String value");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        // upon trying this above, it completely skips the String user input, and returns the result with an empty string.

        // Resolving issue by adding a dummy nextLine()
        System.out.println("Enter int value");
        int j = scan.nextInt();
        System.out.println("Enter double value");
        double k = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter String value");
        String l = scan.nextLine();

        System.out.println("String: " + l);
        System.out.println("Double: " + k);
        System.out.println("Int: " + j);

        // Resolved, now we get an output as expected.

    }
}
