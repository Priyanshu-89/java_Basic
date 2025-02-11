import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int guess=(int)(Math.random()*100)+1;
        int gussedNumber=5;
        do{
            System.out.println("Guess the Number");
            int in=sc.nextInt();
            if(in==guess){
                System.out.println("You guessed it congrats");
                break;
            }
            if(--gussedNumber==0){
                System.out.println("You lost the number was "+guess);
                break;
            }
            if(in>guess){
                System.out.println("Your guess is higher than the number");
            }
            else{
                System.out.println("Your guess is lower than the number");
            }
        }while(true);
        sc.close();
    }
}
