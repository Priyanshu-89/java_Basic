import java.util.Scanner;

public class SwapTheNum {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int c;
        // System.out.println("Before swapping: a = " + a + " b = " + b);
        // c=a;
        // a=b;
        // b=c;

        // System.out.println("After swap : a = " +a +" b = " +b);

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Swapping Station\n");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + " b = " + b);
        int c = a;
        c=a;
        a=b;
        b=c;
        System.out.println("After swap : a = " +a +" b = " +b);
   
        sc.close();
    }
}
