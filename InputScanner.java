import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome " +name +" to KG Coding");


        // Add to Number 
        System.out.print("Enter First Value: ");
        int firstValue=scanner.nextInt();

        System.out.print("Enter Second Value: ");
        int secondValue = scanner.nextInt();

        int sum = firstValue + secondValue;

        System.out.println("Sum of two values is: "+sum);
        
        scanner.close();
    }
}
