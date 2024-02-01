package J2Kad18;
import java.io.*;
/*
	課題名：J2Kad18S「DataInputStream」
	作成日：2022/12/1
	作成者：田中太郎
*/
public class J2Kad18S {
    public static void main(String[] args) {
        final String FILENAME = ".src/J2Kad18/J2Kad18D.java";
        DataInputStream in = null;
        try{
            // DataInputStreamクラスのインスタンス生成
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(FILENAME)));
            //無限ループを作成
            while ( true ){
                in.readByte();
            }
            //1バイトずつデータを読み込み
        } catch (EOFException e ) { // 読み込み処理がおわると例外が発生するのでキャッチする。
            System.out.println("ファイルが読み終わりました！");
        } catch (IOException f ) {
            System.out.println(f);
        } finally {
            if ( in != null) {
                try { in.close(); } catch (IOException e) { System.out.println(e); }
            }
        }
    }
}
