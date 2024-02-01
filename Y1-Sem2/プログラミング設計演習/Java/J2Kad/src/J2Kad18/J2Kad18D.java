package J2Kad18;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
/*
	課題名：J2Kad18D「OutputStream」
	作成日：2022/12/1
	作成者：田中太郎
*/
public class J2Kad18D {
    public static void main(String[] args) {
        final String FILENAME = "test.bin";
        byte[] b = {69, 67, 67, 32, 67, 79, 77, 80};

        try{
            OutputStream out = new FileOutputStream(FILENAME);
            out.write(b);
            out.close();
            System.out.println(FILENAME + "にデータを出力しました！");
        } catch ( IOException e){
            System.out.println(e);
        }
    }
}
