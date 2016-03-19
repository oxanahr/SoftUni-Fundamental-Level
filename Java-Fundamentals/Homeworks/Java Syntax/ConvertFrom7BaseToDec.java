import java.math.BigInteger;
import java.util.Scanner;

/*
Problem 6.	Convert from base-7 to decimal
Write a program that converts from a base-7 number to its decimal representation
Base-7	  Decimal
13	         10
10	          7
234	        123
2626	   1000
1	          1

 */
public class ConvertFrom7BaseToDec {
    public static void main(String[] args) {
        System.out.println("Enter a base-7 number.");
        Scanner in = new Scanner(System.in);
        String bigNumber = in.next();

        // Variant with own methods
        if (checkForValidInput(bigNumber)) {
            System.out.println("Invalid input! Use only digits from 0 to 6");
        } else {
            System.out.print("After converting from a base-7 number to its decimal representation: ");
            if (checkIfNegative(bigNumber)) {
                String unsignedNumber = bigNumber.substring(1);
                System.out.format("-%s\n",
                        convertFromNBaseToDecimal(unsignedNumber, 7));
            } else {
                System.out.format("%s\n",
                        convertFromNBaseToDecimal(bigNumber, 7));
            }
        }

        // Variant with java library method
        String convertedNum = ConvertFromBaseToAnotherBase(bigNumber, 7, 10);
        System.out.println(convertedNum);
    }

    public static String ConvertFromBaseToAnotherBase(String number, int fromBase, int toBase) {
        return new BigInteger(number, fromBase).toString(toBase);
    }

    public static boolean checkForValidInput(String bigNumber) {
        boolean invalidInput = false;
        for (int i = 0; i < bigNumber.length(); i++) {
            if (bigNumber.toCharArray()[i] > '7') {
                invalidInput = true;
            }
        }
        return invalidInput;
    }

    public static boolean checkIfNegative(String number) {
        boolean negative = false;
        if (number.toCharArray()[0] == '-') {
            negative = true;
        }
        return negative;
    }

    private static String convertFromNBaseToDecimal(String numberAsStr, int from) {
        BigInteger number = new BigInteger(numberAsStr);
        BigInteger fromBase = new BigInteger(String.valueOf(from));
        BigInteger result = BigInteger.valueOf(0);
        int i = 0;
        while (i < numberAsStr.length()) {
            BigInteger bi[] = number.divideAndRemainder(BigInteger.TEN);
            BigInteger powOfBase = fromBase.pow(i);
            BigInteger toAdd = bi[1].multiply(powOfBase);
            result = result.add(toAdd);
            number = bi[0];
            i++;
        }
        return result.toString();
    }
}
