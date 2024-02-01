package J2Kad17;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	課題名：J2Kad17C「ファイルからの読み出し」
	作成日：2022/11/28
	作成者：田中太郎
*/

public class J2Kad17C {
    public static void main(String[] args){
        final String FILENAME = "test-C.txt";
        final String ECCCOMP = "ECCCOMP";

        File file = new File(FILENAME);

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(ECCCOMP);
            fw.close();

            FileReader fr = new FileReader(file);
            System.out.println(FILENAME + "から文字列を読み出します！");

            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char)data + "読み出しました！"); // 読み込んだ値（data）をそのまま表示
            }
            fr.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
