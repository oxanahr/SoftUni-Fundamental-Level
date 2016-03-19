import java.util.Scanner;

/**
 * Created by oxana_bs on 10.3.2016 г..
 */
public class DecimalToHexadecimal {
    public static void main(String[] args) {

        // Input
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        // Output
        String hex = Integer.toHexString(number);
        System.out.println("The hexadecimal  value of " + number + " is " + hex.toUpperCase());
    }
}
