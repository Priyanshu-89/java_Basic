import java.util.Scanner;

public class IfElseChallenge {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Create a program that determines if a number is positive, negative, or zero.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num+" is a positive number.");
        }
        else if(num<0){
            System.out.println(num+" is a negative number.");
        }
        else{
            System.out.println(num+" is zero.");
        }

        //Create a program that determines if a number is odd or even.
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        if(num2%2==0){
            System.out.println(num2+" is an even number.");
        }
        else{
            System.out.println(num2+" is an odd number.");
        }

        //Create a program that determines the greatest of the three.
        System.out.print("Enter the first number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num4 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num5 = sc.nextInt();
        if(num3>=num4 && num3>=num5){
            System.out.println(num3+" is the greatest number.");
        }
        else if(num4>=num5){
            System.out.println(num4+" is the greatest number.");
        }
        else{
            System.out.println(num5+" is the greatest number.");
        }

        // Create a program that detemaines if a given year is leap year 

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }

        // Create a program that calculates grades based on marks 
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else if(marks>=60){
            System.out.println("Grade C");
        }
        else if(marks>=30){
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }

        //Create a program that categorize a person into different age grps
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age<13){
            System.out.println("You are a child");
        }
        else if(age<20){
            System.out.println("You are a teenager");
        }
        else if(age<60){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a senior");
        }
        sc.close();


    }
}
