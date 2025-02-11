import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic Operators challenge...");

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number:");
        int num1=sc.nextInt();

        System.out.print("Enter second number:");
        int num2=sc.nextInt();

        int result;

        result = num1 + num2;
        System.out.println("Addition of two numbers is: "+result);

        result = num1 - num2;
        System.out.println("Subtraction of two numbers is: "+result);

        result = num1 * num2;
        System.out.println("Multiplication of two numbers is: "+result);

        result = num1 / num2;
        System.out.println("Division of two numbers is: "+result);

        result=num1%num2;
        System.out.println("Modulus of two numbers is: "+result);

        //create a program to calculate product of two floating points numbers 
        System.out.print("Enter first floating point number:");
        float numbers1=sc.nextFloat();

        System.out.print("Enter second floating point number:");
        float numbers2=sc.nextFloat();

        float result1;

        result1 = numbers1 * numbers2;
        System.out.println("Product of two floating point numbers is: "+result1);

        //create a program to calculate perimeter of a rectangle.
        System.out.print("Enter length of rectangle:");
        int length=sc.nextInt();

        System.out.print("Enter breadth of rectangle:");
        int breadth=sc.nextInt();

        int result2;

        result2 = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is: "+result2);

        // create a program to calculate the Area of a Triangle 

        System.out.print("Enter breadth of Triangle:");
        int breadth1=sc.nextInt();

        System.out.print("Enter height of Triangle:");
        int height=sc.nextInt();

        int result3;

        result3 = (breadth1 * height) / 2;
        System.out.println("Area of Triangle is: "+result3);

        // create a program to calculate simple interest 
        System.out.print("Enter principal amount:");
        double principal=sc.nextDouble();

        System.out.print("Enter rate of interest:");
        double rate=sc.nextDouble();

        System.out.print("Enter time in years:");
        double time=sc.nextDouble();

        double SI;
        SI = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: "+SI);

        // create a program to calculate compound interset 

        System.out.print("Enter principal Amount:");
        int principal1=sc.nextInt();
        
        System.out.print("Enter rate of interest:");
        int rate1=sc.nextInt();

        System.out.print("Enter time in years:");
        int time1=sc.nextInt();

        double CI;

        CI=principal1*Math.pow((1+ rate1/100),time1);
        System.out.println("Compound Interest is: "+CI);

        // create a program to convert fehrenheit to celsius 
        System.out.print("Enter temperature in fehrenheit:");
        int fehrenheit=sc.nextInt();

        double celsius;

        celsius=(fehrenheit -32)*5.0f/9.0f;
        System.out.println("Temperature in celsius is: "+celsius);
        
        sc.close();
    }
}
