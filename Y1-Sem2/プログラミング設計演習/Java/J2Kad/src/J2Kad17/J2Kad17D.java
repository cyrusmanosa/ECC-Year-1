package J2Kad17;

import java.io.File;
import java.io.IOException;


/*
	�ۑ薼�FJ2Kad17D�u�t�@�C���ւ̏����o���v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
*/
public class J2Kad17D {
    public static void main(String[] args) throws IOException {
        final String FILENAME = "test-D.txt";
        final String ECCCOMP = "ECCCOMP";

        File file = new File( FILENAME );

        try {
            if ( file.createNewFile() ) {
                System.out.println( file + "���쐬���܂����I");
                System.out.println( file + "��" + ECCCOMP + "���������݂܂����I");
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
