/*
	�ۑ薼�FJ2Kad22D�uECC�\�t�g�������?@�i�Ϗ��j�v
	�쐬���F2022/12/15
	�쐬�ҁF�c�����Y
*/
package J2Kad22.pac22d;
import java.util.Scanner;
public class J2Kad22D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ECCSoft eccSoft = new ECCSoft();
        while(true) {
            System.out.print("�ǂ����܂����H�i0�F������A���g���A1�F������B���g���A-1�F���������j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            eccSoft.setSubNum(n);             // �������̐ݒ�
            eccSoft.work();                   // �������֔���
            System.out.println();
            if ( n > 1) break;
        }
    }
}

// ������
class ECCSoft {
    private int subNum = 0;         // �������ԍ�
    public ECCSoft() {
        System.out.println("�M���Ǝ��т�ECC�\�t�g������Ђł��I");
        System.out.println("�ǂ�ȉۑ�ł����������^���ɉ������܂��I�I");
    }
    public void setSubNum(int subNum) { this.subNum = subNum; }
    public void work() {
        SubContractor ans = null;
        if ( subNum == 0 ){
            ans = new SubA();
        }else if ( subNum == 1) {
            ans = new SubB();
        }

        try{
            ans.work();
        } catch (NullPointerException e) {
            System.out.println("����H�����������Ȃ���?");
        }

    }
}
// ������
abstract class SubContractor { public abstract void work();}
class SubA extends SubContractor { public void work() {
        System.out.println("������A�F���Ƃ�����΂��Ă݂܂��E�E�E");
    }}
class SubB extends SubContractor { public void work() { System.out.println("������B�F�������͂炢�ȁ[�I"); }}
