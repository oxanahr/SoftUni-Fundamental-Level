import java.util.Scanner;

/*Problem 3.	Assign Variables
Find suitable types for variables. You are given the following types: byte, short, int, long, char, boolean,
float, double, and String. Assign the following values to them
false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
Try to assign 32768 to short and see what happens.
*/
public class AssignVariables {
    public static void main(String[] args) {
        byte byteNumber = 127;
        short shortNumber = 32767;
        float floatNumber = 0.5f;
        char character = 'c';
        boolean result = false;
        String str = "Palo Alto, CA";
        int integerNumber = 2000000000;
        double doubleNumber = 0.1234567891011;
        long longNumber = 919827112351L;

        //short notShort = 32768;// exception
    }
}
