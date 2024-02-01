package J2Kad19;
/*
	�ۑ薼�FJ2Kad19C�u��O�𓊂��悤�I�ithrow�j�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class J2Kad19B {
    public static void main(String[] args) {
        System.out.println("��O���X���[���ăL���b�`���܂��I");
        while(true) {
            try {
                throwException();
            } catch (FileNotFoundException e) {System.out.println("FileNotFoundException���L���b�`���܂����I");
            } catch (EOFException e) {System.out.println("EOFException���L���b�`���܂����I");
            } catch (IOException e) {System.out.println("IOException ���L���b�`���܂����I");
            } catch (NegativeNumberException | OverflowException f) {System.out.println(f);
            } catch (Exception d) {
                System.out.println(d + "���L���b�`���܂����I");
                System.out.println("�I�����܂��I");
                break;
            }
            System.out.println();
        }
    }
    public static void throwException() throws IOException, OverflowException, NegativeNumberException{
        Scanner in = new Scanner(System.in);
        System.out.print("�ǂ̗�O���X���[���܂����H�i0:FileNotFoundException�A1:EOFException�A2�FIOException�j�� ");
        int n = Integer.parseInt(in.next());
        if ( n == 0 ) {
            throw new FileNotFoundException();
        } else if ( n == 1 ) {
            throw new EOFException();
        } else if ( n == 2) {
            throw new IOException();
        } else if ( n < 0){
            throw new NegativeNumberException();
        } else{
            throw new OverflowException();
        }
    }

    static class NegativeNumberException extends Exception{ public NegativeNumberException(){super("���̐��ł��I");}}
    static class OverflowException extends Exception{ public OverflowException(){super("0 ����2 �܂ł̐�������͂��Ă��������I");}}
}
