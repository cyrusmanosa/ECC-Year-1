/*
	�ۑ薼�FJ2Kad23A�u�W���u�`�F���W�I�v
	�쐬���F2022/12/15
	�쐬�ҁF�c�����Y
*/
package J2Kad22.pac22a;

import java.util.Scanner;

public class J2Kad22A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("���Ȃ���RPG�̃L�����N�^�[�ł��I");
        System.out.println("�����琢�E���~���`���ɏo�����܂��I");
        System.out.println("�ł����̑O�ɐE�Ƃ�I��ł��������I�I");
        System.out.println();

        RPGCharacter pc = new RPGCharacter();
        Job j;
        while(true) {
            System.out.println(pc + "����A����ɂ��́I");
            System.out.print("�W���u�`�F���W���܂����H�i0�F��m�A1�F���@�g���A2�F�����N�A-1�F����ł����j��");
            int n = in.nextInt();
            if (n < 0) break;
            // �W���u�`�F���W
            j = switch (n) {
                case 0 -> new Fighter();
                case 1 -> new Mage();
                case 2 -> new Monk();
                default -> null;
            };
            pc.setp(j);
            pc.attack();
            pc.defend();
            System.out.println();
        }
    }
}
