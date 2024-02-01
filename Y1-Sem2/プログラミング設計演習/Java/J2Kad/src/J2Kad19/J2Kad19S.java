package J2Kad19;
/*
	課題名：J2Kad19S「MyDecorator」
	作成日：2022/12/5
	作成者：田中太郎
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
        return filename + "の中のデータです！";
    }
}
class MyScanner extends MyReader {
    private Scanner in;
    public MyScanner(InputStream source) { in = new Scanner(source); }
    public String read() {
        System.out.print("何か文字列を入力してください＞");
        return in.next();
    }
}
// Decorator


