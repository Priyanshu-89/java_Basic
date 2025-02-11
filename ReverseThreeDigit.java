import java.util.Scanner;

public class ReverseThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        int num = sc.nextInt();
       if(num<100 || num>999){
        System.out.println("Invalid input");
       }else{
        int lastDigit=num%10;
        int secondLastDigit=(num/10)%10;
        int firstDigit=num/100;

        int reverse=(lastDigit *100) + (secondLastDigit*10) + firstDigit;
        System.out.println("The reverse of the number is: "+reverse);
       }
       sc.close();
    }
}
