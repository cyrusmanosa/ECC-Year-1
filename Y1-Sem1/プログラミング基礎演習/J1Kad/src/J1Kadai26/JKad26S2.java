package J1Kadai26;

public class JKad26S2 {
    public static void main(String[] args) {
    //�f���̔���
    boolean[] isPrime = new boolean[101];
    int title = 0;
    //������false�Ȃ̂őS��true�ɂ���
        for (int i = 0 ; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        System.out.println("�f����\�����܂��I");
        for (int i = 2; i < isPrime.length; i++){
            for (int j = 2; j < isPrime.length; j++) {
                if ( i != j && i % j == 0 && isPrime[i] ) {
                    isPrime[i] = false;
                    title++;
                }
            }
        }
        System.out.println("���[�v�����񐔂�" + title + "��ł��I");
    }
}
