import java.util.Scanner;

public class ChoiceBasedCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the first Number");
            int num1 = sc.nextInt();

            System.out.println("Enter the second Number");
            int num2 = sc.nextInt();
            
            System.out.println("Enter your choice");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result : " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Result : " + (num1 / num2));

                    } else {
                        System.out.println("Error : Division by zero is not allowed");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank You!!");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
            System.out.println();
        } while (choice != 5);
        sc.close();
    }
}
