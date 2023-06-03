package J1Kadai24;
//import kad24.JKad24D //import ��Ifile
import java.util.*;
public class JKad24C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("��������͂��Ă���������");
        int num = sc.nextInt();
        System.out.println(num + "\t" + JKad24D.getBinString(num)); //�p�V�O��flie��program
        String opStr[] = {"<<", ">>", "~"};
        // ���̓��b�Z�[�W�\��
        System.out.print("���̉��Z�����܂����H�i0�F<<�A1�F>>�A2�F~�j��");
        //�@���͒l���i�[
        int op = sc.nextInt();
        System.out.println(opStr[op] + "\t" + JKad24D.getBinString(num));
        // ���͒l�ɂ���ĕ���
        switch (op) {
            // ���͒l���O
            case 0:
                num <<= 1;
                break;
            //�@���͒l���P
            case 1:
                num >>= 1;
                break;
            //�@���͒l���Q
            case 2:
                // �r�b�g�𔽓]
                num = ~num;
            default:
        }
        System.out.println("------------");
        System.out.println(" \t" + JKad24D.getBinString(num));
    }
}
