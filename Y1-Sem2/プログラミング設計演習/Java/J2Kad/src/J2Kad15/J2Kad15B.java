package J2Kad15;
/*
	�ۑ薼�FJ2Kad15B�uECC������3�����I�v
	�쐬���F2022/11/21
	�쐬�ҁF�c�����Y
*/
import java.util.Scanner;

public class J2Kad15B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sheep[] nagaya = new Sheep[] { new Sheep(), new Sheep(), new Sheep() };
        while(true) {
            try {
                System.out.print("�����������܂����H�i-1�F�����Ȃ��j��");
                int n = Integer.parseInt(in.next());
                if (n < 0) break;
                nagaya[n].intro();
                System.out.println();
            } catch ( NumberFormatException e ) {
                System.out.println("int �^�łȂ��l�����͂���܂����I");
            } catch (ArrayIndexOutOfBoundsException e ) {
                System.out.println("����ȕ����ԍ��͂���܂���I");
            }
        }
    }
}
