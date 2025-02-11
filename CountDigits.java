import java.util.Scanner;

public class CountDigits {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int count;
        for(count=0; n!=0; n/=10){
            count++;
        }
        if(count==0) count=1;
        System.out.println("Number of digits in the number is "+count);
        sc.close();
    }
   } 
}
