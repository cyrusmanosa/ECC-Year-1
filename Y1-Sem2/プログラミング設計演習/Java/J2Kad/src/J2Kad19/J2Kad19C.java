package J2Kad19;
/*
	�ۑ薼�FJ2Kad19C�u��O�𓊂��悤�I�ithrow�j�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J2Kad19C {
    public static void main(String[] args) {
        System.out.println("��O���X���[���ăL���b�`���܂��I");
        while(true) {
            try {
                throwException();
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException���L���b�`���܂����I");
            } catch (EOFException e){
                System.out.println("EOFException���L���b�`���܂����I");
            } catch (Exception e) {
                System.out.println(e + "���L���b�`���܂����I");
                System.out.println("�I�����܂��I");
                break;
            }
            System.out.println();
        }
    }
    public static void throwException() throws FileNotFoundException , EOFException{
        Scanner in = new Scanner(System.in);
        System.out.print("�ǂ̗�O���X���[���܂����H�i0:FileNotFoundException�A1:EOFException�j��");
        int n = Integer.parseInt(in.next());
        if ( n == 0 ) {
            throw new FileNotFoundException();
        }else{
            throw new EOFException();
        }
    }
}
