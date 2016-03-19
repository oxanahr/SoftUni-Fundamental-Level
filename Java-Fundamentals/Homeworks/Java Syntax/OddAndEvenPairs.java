import java.util.Scanner;

/*Problem 8.	*Odd and Even Pairs
You are given an array of integers as a single line, separated by a space.
Write a program that checks consecutive pairs and prints if both are odd/even or not.
Note that the array length should also be an even number

 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        System.out.println("Enter an array of integers as a single line, separated by a space.\nArray length should also be an even number.");
        Scanner in = new Scanner(System.in);
        String[] array = in.nextLine().trim().split("\\s+");
        if (array.length % 2 != 0) {
            System.out.format("Invalid length");
            return;
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            if (Integer.parseInt(array[i]) % 2 == 0 && Integer.parseInt(array[i + 1]) % 2 == 0) {
                System.out.format("%s, %s -> both are even\n", array[i], array[i + 1]);
            } else if (Integer.parseInt(array[i]) % 2 != 0 && Integer.parseInt(array[i + 1]) % 2 != 0) {
                System.out.format("%s, %s -> both are odd\n", array[i], array[i + 1]);
            } else {
                System.out.format("%s, %s -> different\n", array[i], array[i + 1]);
            }
        }
    }
}

