public class IfNumDiv {
    public static void main(String[] args) {
        int num = 14;
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by both 5 and 7");
        }
        else{
            System.out.println(num + " is not divisible by both 5 and 7");
        }

    }
}
