public class Pallindrom {
    public static void main(String[] args) {
        int n = 1221;
        int rev = 0;
        int temp = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

}
