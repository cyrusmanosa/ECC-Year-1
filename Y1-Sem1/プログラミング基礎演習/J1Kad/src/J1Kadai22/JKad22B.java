package J1Kadai22;

public class JKad22B {
    public static void main(String[] args) {
        int[][] num = new int [9][9];
        for (int i = 1; i <= num.length; i++){
            System.out.print(i + ": ");
            for (int j = 1; j <= num.length; j++){
                System.out.print(j*i + " ");
            }
            System.out.println(" ");
        }
    }
}
