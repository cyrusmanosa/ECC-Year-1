package J2Kad17;
import java.io.*;
/*
	�ۑ薼�FJ2Kad17B�u�X�g���[���̘A���v
	�쐬���F2022/11/24
	�쐬�ҁF�c�����Y
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
                System.out.println( FILENAME0 + "���폜���܂����I");
            }
            File Newfile = new File( FILENAME1 );
            if ( Newfile.createNewFile() ){ System.out.println(FILENAME1 + "���쐬���܂����I"); }

            FileWriter fw = new FileWriter(Newfile);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("�����X�^�[�ꗗ���쐬���܂��I");
            for ( int i = 0 ; i < 5 ; i++) {
                Monster M = new Monster();
                bw.write(M.getName());
                bw.newLine();
                System.out.println( M + "��ǉ������I");
            }
            bw.close();
            fw.close();

            System.out.println();

            FileReader fr = new FileReader(Newfile);
            BufferedReader br = new BufferedReader(fr);
            String name;
            System.out.println("�����X�^�[�ꗗ��\�����܂��I");
            while ( (name = br.readLine()) != null ){ System.out.println(name + "��ǂݏo����"); }
            br.close();
            fr.close();
        } catch ( IOException e ){
            System.out.println();
        }

    }
}
