package J2Kad17;
import java.io.*;
import java.util.Scanner;
/*
	�ۑ薼�FJ2Kad17A�u�h�b�g�p�^�[���̕\���v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
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
            System.out.print("�ǂ̃h�b�g�p�^�[�������܂����H�i�g���q�s�v�A-1�F�I���j�� ");
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
                    System.out.println("���̃f�[�^�͑��݂��܂���I");
                    System.out.println();
                    continue;
                }
            } catch (IOException e) { System.out.println( e ); }
        }
    }
}
