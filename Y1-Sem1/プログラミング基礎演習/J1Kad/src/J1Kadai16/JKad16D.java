package J1Kadai16;

public class JKad16D {
    public static void main(String[] args) {
        int[] a = { 1 , 2 , 3 };
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println( "a[" + i + "]" + a[i] );
                if (i == 2) {
                    System.out.println("a[0]��a[2]�����ւ��܂��I");
                    a[0] = 3;
                    a[1] = 2;
                    a[2] = 1;
                }
        }
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("a[" + i + "]" + a[i]);
        }
    }
}
