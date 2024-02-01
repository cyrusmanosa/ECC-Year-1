/*
	�ۑ薼�FJ2Kad22C�uECC�\�t�g�������?A�i�������̒ǉ��j�v
	�쐬���F2022/12/15
	�쐬�ҁF�c�����Y
*/
package J2Kad22.pac22c;

import java.util.Scanner;
public class J2Kad22C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();
        while(true) {
            System.out.print("�ǂ����܂����H�i0�F������A���g���A1�F������B���g���A2�F������C���g���A-1�F���������j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            SubContractor ans = null;
            if ( n == 0 ) { ans = new SubA(); }
            else if ( n == 1 ) { ans = new SubB(); }
            else if ( n == 2 ) { ans = new SubC(); }

            eccSoft.setSub(ans);             // �������̐ݒ�
            eccSoft.work();                   // �������֔���
            System.out.println();
        }
    }
}
// ������
class ECCSoft {
    private SubContractor Nsub = null;
    public ECCSoft() {
        System.out.println("�M���Ǝ��т�ECC�\�t�g������Ђł��I");
        System.out.println("�ǂ�ȉۑ�ł����������^���ɉ������܂��I�I");
    }
    public void setSub(SubContractor Nsub) { this.Nsub = Nsub; }
    public void work() { Nsub.work();}
}
// ������
abstract class SubContractor { public abstract void work();}
// ������A
class SubA extends SubContractor { public void work() { System.out.println("������A�F���Ƃ�����΂��Ă݂܂��E�E�E");}}
// ������B
class SubB extends SubContractor { public void work() { System.out.println("������B�F�������͂炢�ȁ[�I"); }}
// ������C
class SubC extends SubContractor { public void work() { System.out.println("������C�F��낱��ł������󂯂������܂��I"); }}
