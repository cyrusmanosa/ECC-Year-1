package J2Kad15;

/*
	�ۑ薼�FJ2Kad15S�uECC�����Z���^�[�i�J�ݏ������j�v
	�쐬���F2022/11/21
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad15S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ECC�����Z���^�[�J�ݏ������ł��I");
        System.out.println("�����̃V�~�����[�V�������s���܂��I");

        Nobita nobita = new Nobita();
        Jaian jaian = new Jaian();
        Suneo suneo = new Suneo();

        int nobitaOK = 0;
        int jaianOK = 0;
        int suneoOK = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("���ԍ��F" + i + "���󂯕t�����I");
            if (nobita.handle(i)) nobitaOK++;
            if (jaian.handle(i)) jaianOK++;
            if (suneo.handle(i)) suneoOK++;
            System.out.println();
        }

        System.out.println("���ꂼ�ꂪ�Ή������񐔂�");
        System.out.println(nobita + "�F" + nobitaOK + "��");
        System.out.println(jaian + "�F" + jaianOK + "��");
        System.out.println(suneo + "�F" + suneoOK + "��");
    }
}
