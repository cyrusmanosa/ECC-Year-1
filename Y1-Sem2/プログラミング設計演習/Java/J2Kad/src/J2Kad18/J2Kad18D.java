package J2Kad18;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
/*
	�ۑ薼�FJ2Kad18D�uOutputStream�v
	�쐬���F2022/12/1
	�쐬�ҁF�c�����Y
*/
public class J2Kad18D {
    public static void main(String[] args) {
        final String FILENAME = "test.bin";
        byte[] b = {69, 67, 67, 32, 67, 79, 77, 80};

        try{
            OutputStream out = new FileOutputStream(FILENAME);
            out.write(b);
            out.close();
            System.out.println(FILENAME + "�Ƀf�[�^���o�͂��܂����I");
        } catch ( IOException e){
            System.out.println(e);
        }
    }
}
