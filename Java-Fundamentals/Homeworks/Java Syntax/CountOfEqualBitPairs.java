import java.util.Scanner;

/*Problem 8. * Count of Equal Bit Pairs
Write a program to count how many sequences of two equal bits ("00" or "11")
can be found in the binary representation of given integer number n
(with overlapping). Examples:

n     binary representation of n    count
5               101                     0
0                 0                     0
15              1111                    3
 */

public class CountOfEqualBitPairs {
    public static void main(String[] args) {

        // Input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberDividedByTwo = number >> 1;
        System.out.println(Integer.toBinaryString(number));

        int pairOfZeros = 0;
        int pairOfOnes = 0;

        // Main Logic
        while (numberDividedByTwo != 0) {
            int bitFirstNumber = number & 1;
            int bitSecondNumber = numberDividedByTwo & 1;

            if (bitFirstNumber ==  1 && bitSecondNumber == 1) {
                pairOfOnes++;
            }
            if (bitFirstNumber == 0 && bitSecondNumber == 0) {
                pairOfZeros++;
            }
            number >>= 1;
            numberDividedByTwo >>= 1;
        }
        // Output - total number of pairs
        System.out.println(pairOfOnes + pairOfZeros);
    }
}
