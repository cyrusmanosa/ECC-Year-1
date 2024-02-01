package J2Kad18;
/*
	課題名：J2Kad18C「InputStream」
	作成日：2022/12/1
	作成者：田中太郎
*/
import java.io.*;
public class J2Kad18C {
    public static void main(String[] args) {
        final String FILENAME = "test.bin";
        try {
            InputStream in = new FileInputStream(FILENAME);
            int len; // 読み込んだデータ数
            byte[] b = new byte[1024]; // データ読み込み用配列
            while ((len = in.read(b)) != -1) { // データ読み込み（データがないときは-1）
                // 読み込んだデータに対する処理
                for (int i = 0 ; i < len; i++){
                    System.out.print(b[i] + " ");
                }
                System.out.println(len);
            }
            in.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
