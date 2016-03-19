import java.util.Scanner;

/**
 * Created by oxana_bs on 2.3.2016 г..
 */
public class PrintCharacterTriangle {
    public  static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer between 1 to 26");
        int x = in.nextInt();

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
        for (int i = x - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
    }
}
