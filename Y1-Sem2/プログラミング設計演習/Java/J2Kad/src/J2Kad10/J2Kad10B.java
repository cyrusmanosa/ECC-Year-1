package J2Kad10;/*
	�ۑ薼�FJ2Kad10C�u�񋓌^?�v
	�쐬���F2022/10/31
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad10B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("����񂯂�����܂��I");
//      ��̏Љ�

        Janken.Hand[] hands = Janken.Hand.values();
        for(Janken.Hand h : hands){
            System.out.println(h.name + ":" + h.feature);
        }

        while(true) {
            // ��̑I��
            System.out.println();
            System.out.print("���������܂���?(0:�O�[�A1:�`���L�A2:�p�[�A-1:�I���j��");
            int user = in.nextInt();
            if (user < 0) break;
            int comp = (int)(Math.random() * 3);

            System.out.println("���Ȃ���" + hands[user].name + "���o�����I" );
            System.out.println("�R���s���[�^��" + hands[comp].name + "���o�����I");
            System.out.println(Janken.resultTbl[user][comp].msg);
        }
    }
}
