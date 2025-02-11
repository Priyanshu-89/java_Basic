import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first=sc.nextInt();
        System.out.println("Enter the second number: ");
        int second=sc.nextInt();
        int sum=first+second;
        int diff=first-second;
        int product=first*second;
        int quotient=first/second;
        System.out.println("Sum: "+sum);
        System.out.println("Different :"+diff);
        System.out.println("Product :" +product);
        System.out.println("Division :" +quotient);
        sc.close();

    }
}
