package J2Kad18;
import java.io.*;
import java.net.URL;

/*
	�ۑ薼�FJ2Kad18A�uWeb�y�[�W�̃R�s�[�v
	�쐬���F2022/12/1
	�쐬�ҁF�c�����Y
*/
public class J2Kad18A {
    public static void main(String[] args) {
        final String DSTFILE = "ecc.html";
        InputStream in = null;
        OutputStream out = null;
        try {
            URL url = new URL("https://comp.ecc.ac.jp/");
            in = new BufferedInputStream(url.openStream());
            out = new BufferedOutputStream(new FileOutputStream(DSTFILE));
            int len;
            byte[] b = new byte[1024];

            while ( (len = in.read(b)) != -1){
                for ( int i = 0; i < len; i++){ out.write(b, 0, len); }
            }
            System.out.println("HTML ���擾���܂����I");
            in.close();
        } catch (IOException e){
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
