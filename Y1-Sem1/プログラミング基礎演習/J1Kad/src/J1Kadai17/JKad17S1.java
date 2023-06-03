package J1Kadai17;

public class JKad17S1 {
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n ; i+=2) {
            System.out.print( a + "\t");
            a = a + b;
            System.out.print( b + "\t");
            b = a + b;
        }
        return a;
    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}
