package J2Kad18;
/*
	�ۑ薼�FJ2Kad18C�uInputStream�v
	�쐬���F2022/12/1
	�쐬�ҁF�c�����Y
*/
import java.io.*;
public class J2Kad18C {
    public static void main(String[] args) {
        final String FILENAME = "test.bin";
        try {
            InputStream in = new FileInputStream(FILENAME);
            int len; // �ǂݍ��񂾃f�[�^��
            byte[] b = new byte[1024]; // �f�[�^�ǂݍ��ݗp�z��
            while ((len = in.read(b)) != -1) { // �f�[�^�ǂݍ��݁i�f�[�^���Ȃ��Ƃ���-1�j
                // �ǂݍ��񂾃f�[�^�ɑ΂��鏈��
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
