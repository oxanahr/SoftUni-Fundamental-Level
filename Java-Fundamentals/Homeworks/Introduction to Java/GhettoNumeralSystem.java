import java.util.Scanner;

/*Problem 7.	*Ghetto Numeral System

 Write a program that converts the decimal number system to the ghetto numeral system.
 In the ghetto, numbers are represented as following:
	0 – Gee
	1 – Bro
	2 – Zuz
	3 – Ma
	4 – Duh
	5  - Yo
	6 – Dis
	7 – Hood
	8 – Jam
	9 – Mack

Input	Output

6781	DisHoodJamBro
9374	MackMaHoodDuh
533 	YoMaMa
102 	BroGeeZuz

 */
public class GhettoNumeralSystem {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        String number = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char currentDigit = number.charAt(i);
            switch (currentDigit){
                case '0': sb.append("Gee");break;
                case '1': sb.append("Bro");break;
                case '2': sb.append("Zuz");break;
                case '3': sb.append("Ma");break;
                case '4': sb.append("Duh");break;
                case '5': sb.append("Yo");break;
                case '6': sb.append("Dis");break;
                case '7': sb.append("Hood");break;
                case '8': sb.append("Jam");break;
                case '9': sb.append("Mack");break;
            }
        }

        System.out.println(sb);
    }
}
