import java.util.Scanner;

/*Problem 4.	Calculate expression
Write a program that reads three floating point numbers from the console
and calculates their result with the following formulae:

                       (a + b + c) / √c
((a2 + b2) / (a2 – b2))

               (a – b)
 (a2 + b2 - c3)

 */
public class CalculateExpression {
    public static void main(String[] args) {
        System.out.println("Enter three floating point numbers  a, b and c separated by a space");
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().trim().split("\\s+");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        double firstPow = (a + b + c) / Math.sqrt(c);
        double f1 = Math.pow((a * a + b * b) / (a * a - b * b), firstPow);

        double secondPow = a - b;
        double f2 = Math.pow((a * a + b * b - c * c * c), secondPow);
        double diff = Math.abs((a + b + c) / 3.0 - (f1 + f2) / 2.0);

        System.out.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }
}
