package J2Kad15;
/*
	�ۑ薼�FJ2Kad15A�u��O����?@�܂Ƃ߁v
	�쐬���F2022/11/21
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad15A {
    public static void main(String[] args) {
        int [] array = new int [5];
        while (true) {
            System.out.println();
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("�����鐔����͂��Ă��������� ");
                int n = Integer.parseInt(in.next());
                int RD = (int) (Math.random() * 10);
                int ans = n / RD;
                System.out.println(RD + "�Ŋ���܂��I");
                System.out.println("�v�Z���ʂ�" + ans + "�ł��I");
                int RDArray = (int) (Math.random() * 10);
                System.out.println("�z���" + RDArray + "�ԖڂɊi�[���܂��I");
                array[RDArray] = ans;
                System.out.println("����������ɍs���܂����I");
            }

            catch ( ArrayIndexOutOfBoundsException e ) {
                System.out.println("�z��Ɋi�[�ł��܂���I");
            }

            catch ( ArithmeticException e ) {
                System.out.println("0 �Ŋ���܂��I");
                System.out.println("0 ���Z���������܂����I");
                break;
            }

            catch ( NumberFormatException e ){
                System.out.println("int �^�łȂ��l�����͂���܂����I");
            }

            finally {
                System.out.println("finally �u���b�N�̏����ł��I");
            }
        }
        System.out.println("�I�����܂��I");
    }
}
