package J2Kad17;
import java.io.*;
/*
	課題名：J2Kad17B「ストリームの連結」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad17B {
    public static void main(String[] args) {
        final String FILENAME0 = "test.txt";
        final String FILENAME1 = "test-B.txt";
        try {
            File Oldfile = new File(FILENAME0);
            Oldfile.createNewFile();
            if ( Oldfile.exists() ) {
                Oldfile.delete();
                System.out.println( FILENAME0 + "を削除しました！");
            }
            File Newfile = new File( FILENAME1 );
            if ( Newfile.createNewFile() ){ System.out.println(FILENAME1 + "を作成しました！"); }

            FileWriter fw = new FileWriter(Newfile);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("モンスター一覧を作成します！");
            for ( int i = 0 ; i < 5 ; i++) {
                Monster M = new Monster();
                bw.write(M.getName());
                bw.newLine();
                System.out.println( M + "を追加した！");
            }
            bw.close();
            fw.close();

            System.out.println();

            FileReader fr = new FileReader(Newfile);
            BufferedReader br = new BufferedReader(fr);
            String name;
            System.out.println("モンスター一覧を表示します！");
            while ( (name = br.readLine()) != null ){ System.out.println(name + "を読み出した"); }
            br.close();
            fr.close();
        } catch ( IOException e ){
            System.out.println();
        }

    }
}
