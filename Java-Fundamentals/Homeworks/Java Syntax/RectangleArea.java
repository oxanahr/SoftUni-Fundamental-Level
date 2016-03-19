import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Problem 1.	Rectangle Area
Write a program that enters the sides of a rectangle (two integers a and b)
and calculates and prints the rectangle's area.
Examples:
Input 	Output
7 20  	140
5 12  	60

 */
public class RectangleArea {
    public static void main(String[] args) throws IOException {

        // Variant with BufferedReader
        System.out.println("Enter two integers(a and b) as a single line, separated by a space");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = reader.readLine().trim().split("\\s+");
        int a1 = Integer.parseInt(inp[0]);
        int b1 = Integer.parseInt(inp[1]);
        System.out.format("Rectangle area with sides %d and %d: %d\n", a1, b1, calculateRectangleArea(a1, b1));

        // Variant with Scanner
        System.out.println("Enter another two integers(a and b) as a single line, separated by a space");
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().trim().split("\\s+");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.format("Rectangle area with sides %d and %d: %d", a, b, calculateRectangleArea(a, b));
    }

    public static int calculateRectangleArea(int a, int b){
        return a * b;
    }
}
