package J2Kad17;
import java.io.*;
import java.util.Scanner;
/*
	課題名：J2Kad17A「ドットパターンの表示」
	作成日：2022/11/28
	作成者：田中太郎
*/

public class J2Kad17A {
    public static void main(String[] args) {
        final String PATHNAME = "./data/";
        String filename;

        while ( true ) {
            for ( int i = 0 ; i < 10 ; i ++ ){ System.out.print(" " + i + ".txt "); }
            System.out.println();
            for ( int i = 0 ; i < 26; i++){
                if ( i % 10 == 0 && i != 0){ System.out.println(); }
                System.out.print(" " + (char) (i + 65) + ".txt ");
            }

            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.print("どのドットパターンを見ますか？（拡張子不要、-1：終了）＞ ");
            filename = sc.next();
            if ( filename == "-1" ) break;
            File file = new File(PATHNAME + filename + ".txt");
            try {
                if ( file.exists() ){
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while((line = br.readLine()) != null ) System.out.println(line);
                }else{
                    System.out.println("そのデータは存在しません！");
                    System.out.println();
                    continue;
                }
            } catch (IOException e) { System.out.println( e ); }
        }
    }
}
