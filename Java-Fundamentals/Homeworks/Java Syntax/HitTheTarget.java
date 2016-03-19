import java.util.Scanner;

/*Problem 9. *Hit the Target
Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers
between 1 and 20, which, if added or subtracted, result in the target.
Target
5
Output
1 + 4 = 5
2 + 3 = 5
3 + 2 = 5
…
19 - 14 = 5
20 - 15 = 5

Target
35
Output
15 + 20 = 35
16 + 19 = 35
17 + 18 = 35
18 + 17 = 35
19 + 16 = 35
20 + 15 = 35
 */

public class HitTheTarget {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if(i + j == target){
                    System.out.format("%d + %d = %d\n", i, j, target);
                }
                if(i - j == target){
                    System.out.format("%d - %d = %d\n", i, j, target);
                }
            }
        }
    }
}
