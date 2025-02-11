import java.util.Scanner;

public class GreaterAmongThree {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number: ");
       int a=sc.nextInt();

       System.out.println("Enter 2nd number:");
       int b=sc.nextInt();

       System.out.println("Enter 3rd Number:");
       int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " a is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+ " b is greater");
        }

        else{
            System.out.println(c+ " c is greater");
        }
        sc.close();
    }
}
