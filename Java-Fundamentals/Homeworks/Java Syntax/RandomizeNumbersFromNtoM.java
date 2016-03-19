import java.util.Random;
import java.util.Scanner;

/*Problem 7.	Randomize numbers from N to M
Write a program that takes as input two integers N and M,
and randomizes the numbers between them.
Note that M may be smaller than or equal to N.
N	 M	   Randomized (your output may be different : ))
13	 10	    10 12 13 11
10	 20	    12 13 20 10 11 18 15 17 14 19 16
5	 5	    5

 */
public class RandomizeNumbersFromNtoM {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Enter two integers N and M that M may be smaller than or equal to N.");
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 0; i <= Math.abs(n - m); i++)
        {
            int answer = randInt(m, n);
            System.out.print(answer);
            System.out.print(" ");
        }
        //int result =  n + (int)(Math.random() * ((m - n) + 1));
    }
    public static int randInt(int min, int max) {
        Random rand = new Random();
        if(min > max){
            int temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt((max - min) + 1) + min;
    }

}
