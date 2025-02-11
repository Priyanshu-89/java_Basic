import java.util.Scanner;

public class LoopFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // printMultipleTable(num);
        // sumOddNumbers(num);
        // factorial(num);
        // sumOfDigits(num);

        // For LCM
        // System.out.print("Enter a number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter another number: ");
        // int num2 = sc.nextInt();
        // int lcm=findLCM(num1, num2);
        // System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);

        //For GCD
        // int gcd = findGCD(num1, num2);
        // System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

        // System.out.print("Enter a Number :");
        // int num = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        // rightHalfPyramid(rows);
        // reverseRightHalfPyramid(rows);
        leftHalfPyramid(rows);


    //    boolean isArmstrong=isArmstrong(num);
    //    if(isArmstrong){
    //     System.out.println(num+" is an Armstrong Number");
    //    }else{
    //     System.out.println(num+" is not an Armstrong Number");
    //    }

    //     boolean isPalindrome=isPalindrome(num);
    //    if(isPalindrome){
    //     System.out.println(num+" is an Palindrome Number");
    //    }else{
    //     System.out.println(num+" is not an Palindrome Number");
    //    }



        // System.out.println("Fibonacci Series");
        // printFibonacci(num);

        // int reverse=reverseDigit(num);
        // System.out.println("Reverse of "+num+" is "+reverse);
       
    //   boolean isPrime=isPrime(num);
    //   if(isPrime){
    //     System.out.println(num+" is a prime number");
    //   }else{
    //     System.out.println(num+" is not a prime number");
    //   }
       
        sc.close();
    }

    // Develop a program that prints the mulitiplication table for a given number.
    public static void printMultipleTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

    }

    // Create a program to sum all odd numbers from 1 to a specified number N.
    public static void sumOddNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + num + " is :" + sum);
    }

    // Write a function that calculates the factorial of a given number.
    public static void factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    // Create a program that computers the sum of the digits of an integer .
    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;

        }
        System.out.println("Sum of digits of " + num + " is: " + sum);

    }

    // Create a program to find the LEAST COMMON MULTIPLE (LCM) of two numbers.
    public static int findLCM(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }

    // Create a program to find the GREATEST COMMON DIVISOR (GCD) of two numbers.
    public static int findGCD(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // Create a program to check whether a given number is prime. 
    public static boolean isPrime(int num) {
        if(num<=1) return false;

        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    //Create a program to reverse the digits of a number.
    public static int reverseDigit(int num){
       int reversed=0;
       while(num>0){
        int reminder=num%10;
        reversed=reversed*10+reminder;
        num/=10;
       }
       return reversed;
    }

    //Create a program to print the Fibonacci(0 1 1 2 3 5 8 13...) series up to a certain number.
    public static void printFibonacci(int n) {
        if(n<0) return;
        System.out.print("0 ");
         if(n==0) return;
        System.out.print("1 ");

        int first=0, second=1;
        while(first + second<=n){
            int next = first + second;
            System.out.print(next + " ");
            first =second;
            second=next;
        }
         
    }

    // ❌ Create a program to check if a number is an Armstrong number.
    // public static boolean isArmstrong(int num) {
        
    // }

    //Create a program to verify if a number is a palindrome.
    public static boolean isPalindrome(int num) {
        int reversed=reverse(num);
        return num==reversed;


    }

    public static int reverse(int num){
        int reversed=0;
        while(num>0){
            int reminder=num%10;
            reversed=reversed*10+reminder;
            num/=10;
        }
        return reversed;
    }

    //Create a program that print patterns: 
    // 1. Right half Pyramid

    public static void rightHalfPyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }

            System.out.println();

        }

    }
    // 2. Reversed Right half Pyramid
    public static void reverseRightHalfPyramid(int num){
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // 3. Left half Pyramid
    public static void leftHalfPyramid(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
