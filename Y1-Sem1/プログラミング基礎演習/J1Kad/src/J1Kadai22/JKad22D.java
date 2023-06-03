package J1Kadai22;

public class JKad22D {
    public static void main(String[] args) {
        int[] arrange = new int[10];
        for ( int i = 0 ; i < arrange.length; i++){
            arrange[i] = i;
            System.out.println("i = " + i);
            for ( int j = 0; j < arrange.length; j++){
                System.out.print("j = " + j + "�A");
            }
            System.out.println(" ");
        }
    }
}
