package J2Kad15;
/*
	�ۑ薼�FJ2Kad15C�u��O����?A�itry�`catch�`finally�j�v
	�쐬���F2022/11/21
	�쐬�ҁF�c�����Y
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class J2Kad15C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("����1����͂��Ă���������");
            int n1 = in.nextInt();
            System.out.print("����2����͂��Ă���������");
            int n2 = in.nextInt();
            div(n1, n2);
        } catch ( InputMismatchException e){
            System.out.println(e);
            System.out.println("int �^�łȂ��l�����͂���܂����I");
        } finally {
            System.out.println("finally �u���b�N�̏����ł��I");
        }
    }
    public static void div(int n1,int n2) {
        try {
            System.out.println(n1 + "��" + n2 + "���v�Z���܂��I");
            int ans = n1 / n2;
            System.out.println("�v�Z���ʂ�" + ans + "�ł��I");
        }
        catch ( ArithmeticException c ) {
            System.out.println(c);
            System.out.println("0 ���Z���������܂����I");
        }
    }
}
