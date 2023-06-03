package J1Kadai16;

public class JKad16A {
    public static void main(String[] args) {
        int [] scores = {30,50,100,70,95};
        int max = scores[0];

        if (scores[1] > max){
            max = scores[1];
        }

        if (scores[2] > max) {
            max = scores[2];
        }

        if (scores[3] > max) {
            max = scores[3];
        }

        if (scores[4] > max) {
            max = scores[4];
        }
        System.out.println("�ō����_��T���܂��I");
        System.out.println("�ō����_��" + max + "�_�ł��I");
    }
}
