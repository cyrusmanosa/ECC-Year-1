package J2Kad19;
/*
	�ۑ薼�FJ2Kad19S�uMyDecorator�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/
import java.io.InputStream;
import java.util.Scanner;

public class J2Kad19S {
    public static void main(String[] args) {
        MyReader in;

        // MyFileReader?@
        in = new MyFileReader("test.txt");
        System.out.println(in.read());

        // MyScanner
        in = new MyScanner(System.in);
        System.out.println(in.read());

        // MyFileReader?A
        in = new MyFileReader("test2.txt");
        System.out.println(in.read());
    }
}

abstract class MyReader {
    public abstract String read();
}
class MyFileReader extends MyReader {
    private String filename;
    public MyFileReader(String filename) { this.filename = filename; }
    public String read() {
        return filename + "�̒��̃f�[�^�ł��I";
    }
}
class MyScanner extends MyReader {
    private Scanner in;
    public MyScanner(InputStream source) { in = new Scanner(source); }
    public String read() {
        System.out.print("�������������͂��Ă���������");
        return in.next();
    }
}
// Decorator


