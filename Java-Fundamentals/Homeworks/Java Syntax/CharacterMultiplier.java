import com.sun.media.sound.InvalidFormatException;

import java.util.Scanner;

/*Problem 10. Character Multiplier
Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two characters.
If one of the strings is longer than the other, add the remaining character codes to the total sum without
multiplication.
Input          Output
Gosho Pesho    53253
123 522        7647
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        System.out.println("Enter two strings as a single line, separated by a space");
        Scanner in = new Scanner(System.in);
        String[] twoStrings = in.nextLine().trim().split("\\s");

        if (twoStrings.length <= 1){
            System.out.println("Invalid input. You must enter two strings");
        }

        String first = twoStrings[0];
        String second = twoStrings[1];
        int sum = sumTwoStrings(first, second);
        System.out.println(sum);
    }

    public static int sumTwoStrings(String first, String second) {
        int sum = 0;
        int length = Math.max(first.length(), second.length());
        for (int i = 0; i < length; i++) {
            sum += first.charAt(i % first.length()) * second.charAt(i % second.length());
        }
        return sum;
    }
}
