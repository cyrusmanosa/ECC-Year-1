/*
	�ۑ薼�FJ2Kad22S�u�|�P�b�gDuck�I�v
	�쐬���F2022/12/15
	�쐬�ҁF�c�����Y
*/
package J2Kad22.pac22S;

import java.util.Scanner;

public class J2Kad22S {
    public static void main(String[] args) {
        System.out.println("�|�P�b�gDuck�ւ悤�����I");
        System.out.println("����΂��Ė쒹���Q�b�g���悤�I�I");
        System.out.println();

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("�ǂ̖쒹���Q�b�g���܂����H�i0�F�A�q���A1�F�J���X�A2�F�J�����A3�F�j���g���A-1�F�I���j��");
            int type = Integer.parseInt(in.next());
            if (type < 0) break;

            Bird bird;
            switch(type) {
                default:
                case 0: bird = new Duck();      break;
                case 1: bird = new Crow();      break;
                case 2: bird = new Seagull();   break;
                case 3: bird = new Chicken();   break;
            }
            System.out.println();

            while(true) {
                System.out.print("���������܂����H�i0�F��ԁA1�F�j���A2�F�i���A-1�F�I���j��");
                int cmd = Integer.parseInt(in.next());
                if (cmd < 0) break;

                switch(cmd) {
                    case 0: bird.fly();     break;
                    case 1: bird.swim();     break;
                    case 2: bird.evolve();  break;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
