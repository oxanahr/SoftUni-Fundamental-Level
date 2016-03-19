import java.util.Scanner;
/*
 Problem 6.	 Sum numbers from 1 to N
 Input	Output
 12	78
 Input	Output
 1	1
 Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N (inclusive).
 Input	Output
 5	15

 */

public class SumAllNumbersFromOneToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You can check five sums");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a positive integer");
            int n = scan.nextInt();
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += j;
            }
            System.out.format("Sum of all numbers from 1 to %d: %d%n", n, sum);
        }
    }
}
