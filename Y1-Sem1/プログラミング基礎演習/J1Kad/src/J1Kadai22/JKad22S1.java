package J1Kadai22;

public class JKad22S1 {
    public static void main(String[] args) {
        for ( int i = 1; i <= 9; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 9; j >= i; j--){
                System.out.print("*");
            }
            if ( i!=9) {
                System.out.println(" ");
            }
        }
        for (int i = 0; i <=9; i++){
            for (int j = 9; j > i; j--){
                System.out.print(" ");
            }
            for ( int j = 1; j <=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
