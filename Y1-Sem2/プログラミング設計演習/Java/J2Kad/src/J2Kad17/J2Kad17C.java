package J2Kad17;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	�ۑ薼�FJ2Kad17C�u�t�@�C������̓ǂݏo���v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
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
            System.out.println(FILENAME + "���當�����ǂݏo���܂��I");

            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char)data + "�ǂݏo���܂����I"); // �ǂݍ��񂾒l�idata�j�����̂܂ܕ\��
            }
            fr.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
