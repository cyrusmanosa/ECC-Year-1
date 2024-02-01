package J2Kad17;

import java.io.File;
import java.io.IOException;


/*
	課題名：J2Kad17D「ファイルへの書き出し」
	作成日：2022/11/28
	作成者：田中太郎
*/
public class J2Kad17D {
    public static void main(String[] args) throws IOException {
        final String FILENAME = "test-D.txt";
        final String ECCCOMP = "ECCCOMP";

        File file = new File( FILENAME );

        try {
            if ( file.createNewFile() ) {
                System.out.println( file + "を作成しました！");
                System.out.println( file + "に" + ECCCOMP + "を書き込みました！");
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
