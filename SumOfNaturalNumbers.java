import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=N;i++){
        //     sum=sum+i;
        // }

        //Direct formula

        int sum=(N*(N+1))/2;
        System.out.println("Sum of first "+N+" natural numbers is "+sum);
        sc.close();
    }
}
