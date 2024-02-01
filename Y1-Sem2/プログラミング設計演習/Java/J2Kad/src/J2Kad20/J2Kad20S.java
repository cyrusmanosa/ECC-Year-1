package J2Kad20;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/*
	�ۑ薼�FJ2Kad20S�u���C�t�Q�[��?@�i�����f�[�^�̕\���j�v
	�쐬���F2022/12/08
	�쐬�ҁF�c�����Y
*/
public class J2Kad20S {
    public static final int WIDTH = 40;
    public static final int HEIGHT = 24;
    public static void main(String[] args) {
        Canvas c = new Canvas(WIDTH, HEIGHT);
        initCanvas(c);
        c.show();
    }
    public static void initCanvas(Canvas c) {
        Scanner in = new Scanner(System.in);
        System.out.print("�ǂݍ��ރf�[�^�t�@�C������ ");
        String filename = in.next();
        System.out.print("X���W�� ");
        int Xset = Integer.parseInt(in.next());
        System.out.print("Y���W�� ");
        int Yset = Integer.parseInt(in.next());
        try {
                BufferedReader br = new BufferedReader(new FileReader("./data/" + filename + ".txt"));
                int y = 0;
                String line = null;
                for ( int i = 0 ; i < line.length(); i++ ){
                    c.setPoint(Xset + i, Yset + 0, line.charAt(i) == '*');
                }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}