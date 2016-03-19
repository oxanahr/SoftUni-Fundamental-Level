/*Problem 11. Get First Odd or Even Elements
Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
Format: [Get <number of elements> <odd/even>]

Input
1 2 3 4 5
Get 3 odd
Output
1 3 5

Input
11 6 2 8 1 0
Get 8 even
Output
6 2 8 0
 */

import java.util.*;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        System.out.println("Enter an array of integers as a single line, separated by a space.");
        Scanner in = new Scanner(System.in);
        String[] array = in.nextLine().trim().split("\\s+");

        System.out.println("Enter the following commands in the format: [Get <number of elements> <odd/even>]");
        String[] commands = in.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(commands[1]);
        String oddOrEven = commands[2];

        List<Integer> elements = getFirstNElements(array, n, oddOrEven);
        for (Integer element : elements) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static List<Integer> getFirstNElements(String[] numbers, int n, String oddOrEven) {
        List<Integer> elements = new ArrayList<>();
        for (String number1 : numbers) {
            int number = Integer.parseInt(number1);
            if (elements.size() < n) {
                if (oddOrEven.equals("odd")) {
                    if (number % 2 == 1) {
                        elements.add(number);
                    }
                } else if (oddOrEven.equals("even")) {
                    if (number % 2 == 0) {
                        elements.add(number);
                    }
                }
            }
        }
        return elements;
    }
}
