package J2Kad18;
import java.io.*;
/*
	�ۑ薼�FJ2Kad18B�u�t�@�C���R�s�[�v
	�쐬���F2022/12/1
	�쐬�ҁF�c�����Y
*/
public class J2Kad18B {
    public static void main(String[] args) {
        final String SRCFILE = "test.bin";
        final String DSTFILE = "test2.bin";

        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream(SRCFILE);
            out = new FileOutputStream(DSTFILE);
            int len;
            byte[] b = new byte[1024];
            while ((len = in.read(b)) != -1) { // 1KB = 1024Byte���f�[�^��ǂݍ���
                out.write(b, 0, len); // �z��b �̃C���f�b�N�X0 ����len �̃f�[�^���������ށ@����������Ȃ���len��10�������ꍇ�A�c���1014�̃o�C�g�̘g��NULL�ŏ������܂�Ă��܂��B
            }
            System.out.println("�t�@�C���R�s�[�������܂����I");
        } catch ( IOException e ) {
            System.out.println(e);
        } finally {
            if ( in != null) {
                try { in.close(); } catch (IOException e) { System.out.println(e); }
            }
            if ( out != null ) {
                try { out.close(); } catch (IOException f) { System.out.println(f); }
            }
        }
    }
}
