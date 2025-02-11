public class OperatorIncDec {
    public static void main(String[] args) {
        int a=5;
        int b=++a + a-- - --a + a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x=5;
        int y=++x;
        int z=x++;
        System.out.println("x :" +x);
        System.out.println("Y :" +y);
        System.out.println("Z :" +z);
        
    }
}
