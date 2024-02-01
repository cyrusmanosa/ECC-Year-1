package J2Kad18;
import java.io.*;
/*
	課題名：J2Kad18B「ファイルコピー」
	作成日：2022/12/1
	作成者：田中太郎
*/
public class J2Kad18B {
    public static void main(String[] args) {
        final String SRCFILE = "test.bin";
        final String DSTFILE = "test2.bin";

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(SRCFILE);
            out = new FileOutputStream(DSTFILE);
            int len;
            byte[] b = new byte[1024];
            while ((len = in.read(b)) != -1) { // 1KB = 1024Byteずつデータを読み込む
                out.write(b, 0, len); // 配列b のインデックス0 からlen 個のデータを書き込む　※これをしないとlenが10だった場合、残りの1014のバイトの枠はNULLで書き込まれてしまう。
            }
            System.out.println("ファイルコピー完了しました！");
        } catch ( IOException e ) {
            System.out.println(e);
        } finally {
            if ( in != null) {
                try { in.close(); } catch (IOException e) { System.out.println(e); }
            }
            if ( out != null ) {
                try { out.close(); } catch (IOException f) { System.out.println(f); }
            }
        }
    }
}
