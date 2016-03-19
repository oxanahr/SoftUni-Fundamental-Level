import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Даны целые числа a1,a2,....an.
 Пусть M-наибольшее,а m-наименьшее этих чисел. Найти разницу между ними.

 */
public class DifferenceBetweenMaxAndMinInArray {
    public static void main(String[] args) {
        //7,66  ,  65   ,     75, 1
        String line = null;
        try {
            line = inintial();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] array = getArrayOfIntegers(line);
        int diff = differenceBetweenMaxAndMin(array);
        System.out.println(diff);// 74
    }

    private static int[] getArrayOfIntegers(String line) {
        List<Integer> arrList = new ArrayList<>();
        for (String current : line.split("\\s*,\\s*|\\s")) {
            arrList.add(Integer.parseInt(current));
        }
        int[] array = arrList.stream().mapToInt(i -> i).toArray();
        return array;
    }

    private static String inintial() throws IOException {
        System.out.println("Enter some integers separated by comma");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int differenceBetweenMaxAndMin(int[] array) {
        return Arrays.stream(array).max().getAsInt() - Arrays.stream(array).min().getAsInt();
    }
}
