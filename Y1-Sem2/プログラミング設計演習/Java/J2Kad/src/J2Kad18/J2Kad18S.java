package J2Kad18;
import java.io.*;
/*
	�ۑ薼�FJ2Kad18S�uDataInputStream�v
	�쐬���F2022/12/1
	�쐬�ҁF�c�����Y
*/
public class J2Kad18S {
    public static void main(String[] args) {
        final String FILENAME = ".src/J2Kad18/J2Kad18D.java";
        DataInputStream in = null;
        try{
            // DataInputStream�N���X�̃C���X�^���X����
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(FILENAME)));
            //�������[�v���쐬
            while ( true ){
                in.readByte();
            }
            //1�o�C�g���f�[�^��ǂݍ���
        } catch (EOFException e ) { // �ǂݍ��ݏ����������Ɨ�O����������̂ŃL���b�`����B
            System.out.println("�t�@�C�����ǂݏI���܂����I");
        } catch (IOException f ) {
            System.out.println(f);
        } finally {
            if ( in != null) {
                try { in.close(); } catch (IOException e) { System.out.println(e); }
            }
        }
    }
}
