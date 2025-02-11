import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
    // sumAndAverage();
    Scanner sc=new Scanner(System.in);

    // ************count occurrence start ***************** 
    // System.out.print("Enter the number of elements :");
    // int n=sc.nextInt();
    // int[] arr=new int[n];

    // System.out.print("Enter " + n +" numbers :");
    // for(int i=0; i<n; i++){
    //     arr[i]=sc.nextInt();
    // }
    // System.out.print("Enter the number to count occurrences :");
    // int target=sc.nextInt();

    // int count=countOccurrence(arr, target);
    // System.out.println("The number " + target + " occurs " + count + " times");
    
    // ************count occurrence end ***************** 

    //********************Maximum and Minimun Start******************
    //  System.out.print("Enter the number of elements :");
    //  int n=sc.nextInt();

    //  int[] arr =new int[n];

    //  System.out.print("Enter " + n +" numbers :");
    //  for(int i=0; i<n; i++){
    //     arr[i]=sc.nextInt();

    //  }

    //  int max=findMax(arr);
    //  System.out.println("Maximum Element :" +max);

    //  int min=findMin(arr);
    //  System.out.println("Minimum Element :" +min);
        //********************Maximum and Minimun End******************

        // ******************array is sorted Start********************
        /* System.out.print("Enter the number of elements :");
         int n=sc.nextInt();

         int[] arr=new int[n];

         System.out.println("Enter " + n + " numbers :");
         for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
         }
         if(isSorted(arr)){
            System.out.println("Array is sorted");
         }else{
            System.out.println("Array is not sorted");
         }
             */

        // ******************array is sorted End******************** 

        // *************************Reversed array start**************************** 
        System.out.println("Enter element for array :");
           // *************************Reversed array end**************************** 
    sc.close();
    }

    // create a program to find the sum and average of all elements in an array
    public static void sumAndAverage() {

        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        double average = (double) sum / arr.length;
        System.out.println("Sum of Array :" + sum);
        System.out.println("Average :" + average);
    }

    //Create a program to find number of occurrences of an elements in an array.
    public static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
return count;
    }

    // Create a program to find the maximum and minimum element in an array. 
    public static int findMax(int[] arr) {
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    //Create a program to ckeck if the given array is sorted.

    public static boolean isSorted(int[] arr) {
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    // Create a program to return a new array deleting a specific element 


    //Create a program to reverse an array.

    public static void reversedArray(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        
    }

}
