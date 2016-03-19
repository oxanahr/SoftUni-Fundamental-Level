import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*Из текста убрать все слова определенной длины, которые начинаются на согласную букву.
 */
public class SelectWordsWithFixedLength {
    private static String inintial() throws IOException {
        System.out.print("Input string > ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //System.out.println(s);
        return s;
    }

    private static String result(String line, int length) {
        StringBuilder result = new StringBuilder();
        for (String current : line.split("\\s*,\\s*|\\s")) {
            if ((current.length() == length) && (isConstant(current.toCharArray()[0]))) {
                result.append(current).append(", ");
            }
        }
        return result.toString().substring(0, result.length() - 2);// without last comma
    }

    private static boolean isConstant(char c){
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.indexOf(c) >= 0;
    }

    public static void main(String[] args)  {
        //apple, box , eagle, fish   , iron, open, bike, up, new year
        final int LENGTH_WORD = 4;
        String line = null;
        try {
            line = inintial();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);

        String result = result(line, LENGTH_WORD);
        System.out.println(result);
    }
}
