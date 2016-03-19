import java.util.Scanner;


/*Problem 8.	**Get Average
Create a method that finds the average of three numbers.
Read in internet about java methods. Check the naming conventions.
Invoke your method and test it. Format the output to two digits after the decimal separator. The placeholder is %.2f

a	   b  	       c	  Average
1.5	   2.5 	     3.8	  2.60
12	   13	      25	  16.67
0.005  0.5 	    0.55	  0.35
0	     0 	       2	  0.67

 */
public class GetAverage {
    public static void main(String[] args) {
        System.out.println("Enter three numbers to calculate their average value ");
        Scanner in = new Scanner(System.in);
        float[] arr = new float[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Float.parseFloat(in.nextLine());
        }
        float averageOfThreeNumbers = calculateAverage(arr, 3);
        in.close();
        System.out.format("Average value of three numbers = %.2f", averageOfThreeNumbers);
    }

    public static float calculateAverage(float[] arr, int count) {
        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        return sum / (float) count;
    }
}
