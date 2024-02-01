package J2Kad19;
/*
	課題名：J2Kad19C「例外を投げよう！（throw）」
	作成日：2022/12/5
	作成者：田中太郎
*/
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class J2Kad19B {
    public static void main(String[] args) {
        System.out.println("例外をスローしてキャッチします！");
        while(true) {
            try {
                throwException();
            } catch (FileNotFoundException e) {System.out.println("FileNotFoundExceptionをキャッチしました！");
            } catch (EOFException e) {System.out.println("EOFExceptionをキャッチしました！");
            } catch (IOException e) {System.out.println("IOException をキャッチしました！");
            } catch (NegativeNumberException | OverflowException f) {System.out.println(f);
            } catch (Exception d) {
                System.out.println(d + "をキャッチしました！");
                System.out.println("終了します！");
                break;
            }
            System.out.println();
        }
    }
    public static void throwException() throws IOException, OverflowException, NegativeNumberException{
        Scanner in = new Scanner(System.in);
        System.out.print("どの例外をスローしますか？（0:FileNotFoundException、1:EOFException、2：IOException）＞ ");
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

    static class NegativeNumberException extends Exception{ public NegativeNumberException(){super("負の数です！");}}
    static class OverflowException extends Exception{ public OverflowException(){super("0 から2 までの整数を入力してください！");}}
}
