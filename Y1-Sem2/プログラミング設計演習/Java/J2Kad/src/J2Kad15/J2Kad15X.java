package J2Kad15;

/*
	�ۑ薼�FJ2Kad15X�uECC�����Z���^�[�iChain of Responsibility�j�v
	�쐬���F2022/11/21
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad15X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������ECC �����Z���^�[�ł��I");
        System.out.println("�D�G�ȃX�^�b�t���Ή����܂��I");
        Nobita nobita = new Nobita();
        Jaian jaian = new Jaian();
        Suneo suneo = new Suneo();
        Sizuka sizuka = null; // �܂����Ȃ�
        Dekisugi dekisugi = null; // �܂����Ȃ�
        boolean helper = false; // false�F�����Ȃ��Atrue�F��������
        while(true) {
            System.out.println();
            System.out.print("�ǂ����܂����H�i0�F�����󂯎��A1�F�����𗊂ށA-1�F�����₾�j��");
            int cmd = in.nextInt();
            if (cmd < 0) break;
// �����𗊂�
            if (cmd == 1) {
                sizuka = new Sizuka();
                dekisugi = new Dekisugi();
                helper = true;
                continue;
            }
// ����
            int n = (int)(Math.random() * 100);
            System.out.println("���ԍ��F" + n + "���󂯕t�����I");
//            if ( cmd == 0) {
//                nobita.setNext(jaian).setNext(suneo);
//            }else if ( cmd == 1){
//                nobita.setNext(jaian).setNext(suneo).setNext(sizuka).setNext(dekisugi);
//            }
            if (!nobita.handle(n)) {
                if (!jaian.handle(n)) {
                    if (!suneo.handle(n)) {
                        if (helper) {
                            if (!sizuka.handle(n)) {
                                dekisugi.handle(n);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("�����ꂳ�܂ł����I");
    }
}