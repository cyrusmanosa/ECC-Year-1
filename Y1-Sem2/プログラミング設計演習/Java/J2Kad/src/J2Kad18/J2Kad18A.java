package J2Kad18;
import java.io.*;
import java.net.URL;

/*
	課題名：J2Kad18A「Webページのコピー」
	作成日：2022/12/1
	作成者：田中太郎
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
            System.out.println("HTML を取得しました！");
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
