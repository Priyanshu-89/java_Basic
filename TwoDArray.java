public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr={{5,6,7}, {6,5,4}, {3,5,2}};

        int i=0;
       //Traversal
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
