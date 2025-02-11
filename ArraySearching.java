import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,6,8,7,5,3,23,56,98,76};
        System.out.print("Enter the number to Search: ");
        int num=sc.nextInt();
        boolean isFound=isFound(arr, num);
        if(isFound){
            System.out.println("Number is found in the array");
        }else{
            System.out.println("Number is not found in the array");
        }
        sc.close();

    }

    public static boolean isFound(int[] arr, int num ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
