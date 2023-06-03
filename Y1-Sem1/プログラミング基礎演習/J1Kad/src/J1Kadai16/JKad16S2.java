package J1Kadai16;

public class JKad16S2 {
    public static void main(String[] args) {
        System.out.println("�J�[�h����בւ��܂��I");
        int [] cards = {1,2,3,4,5,6,7,8,9};
        for (int i = 0 ; i <= cards.length; i++) {
            System.out.println("cards[" + i +"]:" + cards[(int)(Math.random()*9)]);
        }
    }
}
