import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int lastDigit=Math.abs(n%10);
        System.out.println("Last digit of the number is "+lastDigit);
        sc.close();
    }
}
