/*
	�ۑ薼�FJ2Kad22B�u�X�[�p�[�R���s���[�^ECC1000�v
	�쐬���F2022/12/15
	�쐬�ҁF�c�����Y
*/
package J2Kad22.pac22b;

import java.util.Scanner;

public class J2Kad22B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�X�[�p�[�R���s���[�^ECC1000���J�������I");
        System.out.println("�A���S���Y�����Z�b�g����΂ǂ�ȍ��x�Ȍv�Z�ł��ł��܂��I�I");

        ECC1000 ecc1000 = new ECC1000();

        while(true) {
            System.out.print("�v�Z�A���S���Y�����Z�b�g���Ă��������i0�FNobita�A1�FSuneo�A2�FDekisugi�A3�FSizuka�A-1�F�I���j�� ");
            int algNum = Integer.parseInt(in.next());
            if (algNum < 0) break;
            // �A���S���Y���̑I��
            SumAlg P = null;

            switch (algNum){
                case 0: P = new NobitaAlg(); break;
                case 1: P = new SuneoAlg(); break;
                case 2: P = new DekisugiAlg(); break;
                case 3: P = new SizukaAlg(); break;
            }

            // ���Z
            ecc1000.setAlg(P);
            ecc1000.sum(10);
            System.out.println();
        }
    }
}
// �X�[�p�[�R���s���[�^ECC1000
class ECC1000 {
    private  SumAlg alg = null;
    public void setAlg ( SumAlg alg ) { this.alg = alg; }
    public void sum (int n) { alg.sum(n); }
}
