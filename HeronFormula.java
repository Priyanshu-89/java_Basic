import java.util.Scanner;

public class HeronFormula {
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First value: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second value: ");
        double b = sc.nextDouble();

        System.out.print("Enter third value:");
        double c = sc.nextDouble();
       double s = (a + b + c) / 2.0;

        double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle is: " + Area);
        sc.close();

    }

}
