package J2Kad21;
/*
	�ۑ薼�FJ2Kad21B�u�R���N�V�����ƃ����_���v
	�쐬���F2022/12/12
	�쐬�ҁF�c�����Y
*/
import java.util.ArrayList;
import java.util.Collections;

public class J2Kad21A {
    public static void main(String[] args) {
        ArrayList <Point> pointList = new ArrayList<>();
        pointList.add(new Point());
        pointList.add(new Point());
        pointList.add(new Point());
        pointList.add(new Point());

        System.out.println("�X�V�O�̃f�[�^��\�����܂��I");
        pointList.forEach( x -> x.printInfo() );

        Collections.sort(pointList);
        System.out.println("���ёւ��܂����I");
        System.out.println("�X�V��̃f�[�^��\�����܂��I");
        pointList.forEach( x -> x.printInfo() );
    }
}
