import java.math.BigInteger;
import java.util.Scanner;

/*Problem 5.	Convert from decimal system to base-7
Write a program that takes an integer number and converts it to base-7
Decimal	   Base-7
10             13
7              10
123           234
1000         2626
1               1
*/

public class ConvertFromDecimalToSevenBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        String number = scan.next();
        System.out.print("Representation in the base-7 system:\n");
        if (checkIfNegative(number)) {
            String unsignedNumber = number.substring(1);
            System.out.format("-%s\n",
                    convertBigIntegerToNBase(unsignedNumber, 7));
        } else {
            System.out.format("%s\n",
                    convertBigIntegerToNBase(number, 7));
        }

        String convertedNum = ConvertFromBaseToAnotherBase(number, 10, 7);
        System.out.println(convertedNum);
    }

    public static String ConvertFromBaseToAnotherBase(String number, int fromBase, int toBase) {
        return new BigInteger(number, fromBase).toString(toBase);
    }

    public static boolean checkIfNegative(String number) {
        boolean negative = false;
        if (number.toCharArray()[0] == '-') {
            negative = true;
        }
        return negative;
    }

    public static String convertBigIntegerToNBase(String numberAsStr, int base) {

        BigInteger number = new BigInteger(numberAsStr);
        StringBuilder remainder = new StringBuilder();
        BigInteger toNBase = new BigInteger(String.valueOf(base));
        while (number.compareTo(BigInteger.ONE) > 0) {
            BigInteger bi[] = number.divideAndRemainder(toNBase);
            remainder.append(bi[1]);
            number = bi[0];
        }
        return remainder.reverse().toString();
    }
}
