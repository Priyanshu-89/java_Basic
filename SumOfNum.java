public class SumOfNum {
    public static void main(String[] args) {
        int n=47;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;

        }
        System.out.println(sum);
    }
}
