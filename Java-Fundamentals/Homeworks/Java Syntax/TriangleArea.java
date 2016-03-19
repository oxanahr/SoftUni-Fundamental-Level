import java.util.Scanner;

/*
/*
Problem 2.	Triangle Area
Write a program that enters 3 points in the plane (as integer x and y coordinates),
calculates and prints the area of the triangle composed by these 3 points.
Round the result to a whole number. In case the three points do not form a triangle,
print "0" as result. Examples:
Input	Output
-5 10
25 30
60 15	575
53 18
56 23
24 27	86
1 1
2 2
3 3	    0

area =|Ax (By −Cy ) + Bx (Cy − Ay ) + Cx (Ay − By)|/2
where Ax and Ay are the x and y coordinates of the point A etc..
 */

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two integers x and y for first point as a single line, separated by a space");
        String[] firstPoint = in.nextLine().trim().split("\\s+");
        int x1 = Integer.parseInt(firstPoint[0]);
        int y1 = Integer.parseInt(firstPoint[1]);

        System.out.println("Enter two integers x and y for second point as a single line, separated by a space");
        String[] secondPoint = in.nextLine().trim().split("\\s+");
        int x2 = Integer.parseInt(secondPoint[0]);
        int y2 = Integer.parseInt(secondPoint[1]);

        System.out.println("Enter two integers x and y for third point as a single line, separated by a space");
        String[] thirdPoint = in.nextLine().trim().split("\\s+");
        int x3 = Integer.parseInt(thirdPoint[0]);
        int y3 = Integer.parseInt(thirdPoint[1]);

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); // side a
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)); // side b
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)); // side c

        if (a + b <= c || a + c <= b || a + c <= b) {
            System.out.println("0");
        } else {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Triangle area: " + Math.round(square));
        }
    }
}
