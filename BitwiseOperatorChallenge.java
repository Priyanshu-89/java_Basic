import java.util.Scanner;

public class BitwiseOperatorChallenge {
    public static void main(String[] args) {
        // Create a program that shows bitwise AND of two numbers 
        int a = 3; 
        int b = 7; 
        int result = a & b; 
        System.out.println(result);

        //Create a program that shows bitwise OR of two numbers.
        int c = 3;
        int d = 7;
        int result1 = c | d;
        System.out.println(result1);

        //Create a program that shows bitwise XOR of two numbers.
        int e = 3;
        int f = 7;
        int result2 = e ^ f;
        System.out.println(result2);

        //Create a program that shows bitwise compliment of a number.
        int g = 5;
        int result3 = ~g;
        System.out.println(result3);

        // create a program that shows use of left shift opeartor. 
        int h = 5;
        int result4 = h << 2;
        System.out.println(result4);

        //Create a program that shows use of right shift operator.
        int i = 20;
        int result5 = i >> 2;
        System.out.println(result5);

        //Create a program to check if a given number is odd or even 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.println(num + " is odd");
        }
        else{
            System.out.println(num + " is even");
            }
            sc.close();

    }
}
