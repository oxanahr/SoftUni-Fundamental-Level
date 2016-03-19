import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Problem 11.	 Starts and Ends With Capital Letter
Write a program that takes as input an array of strings are prints only the
words that start and end with capital letter.
Words are only strings that consist of English alphabet letters. Use regex.
Words                                       Output
GoshO blabla NqmaSm1saL KvoStaA             GoshO KvoStaA
AZ AK 47 RoBoT noWayouT                     AZ AK RoBoT
DrakonI Navsekyde                           DrakonI

 */
public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        System.out.println("Enter the text");
       // Scanner in = new Scanner(System.in);
        String patternStr1 ="\\b[A-Z][a-zA-Z]*[A-Z]\\b";
        String patternStr2 = "\\b\\p{Upper}\\p{Alpha}*\\p{Upper}\\b";
        Pattern p = Pattern.compile(patternStr1);
        Pattern pattern =
                Pattern.compile(patternStr2);
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while (stdin.hasNext()) {
            String input = stdin.nextLine();
            Matcher matcher1 =
                    pattern.matcher(input);

            boolean found = false;
            LinkedList<String> list = new LinkedList<>();
            while (matcher1.find()) {
               /* System.out.format("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher1.group(),
                        matcher1.start(),
                        matcher1.end());*/
                found = true;
            }
            Matcher matcher2 =
                    p.matcher(input);
            while (matcher2.find()) {
                list.add(matcher2.group());
            }
            System.out.println(list);
            if (!found) {
                System.out.format("No match found.%n");
            }
        }
    }
}
