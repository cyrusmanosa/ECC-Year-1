package J2Kad21;

/*
	�ۑ薼�FJ2Kad21B�u�R���N�V�����ƃ����_���v
	�쐬���F2022/12/12
	�쐬�ҁF�c�����Y
*/

import java.util.ArrayList;

public class J2Kad21B {
    public static void main( String[] args) {
        ArrayList <Point> pointList = new ArrayList<>();

        pointList.add( new Point() );
        pointList.add( new Point() );
        pointList.add( new Point() );
        pointList.add( new Point() );

        System.out.println( "�X�V�O�̃f�[�^��\�����܂��I" );
        pointList.forEach( x -> x.printInfo() );
        System.out.println( "2�{���܂��I" );
        pointList.forEach( x -> { x.x *= 2; x.y *= 2; } );
        System.out.println( "�X�V��̃f�[�^��\�����܂��I" );
        pointList.forEach( x -> x.printInfo() );
    }
}
