package J2Kad21;

/*
	課題名：J2Kad21B「コレクションとラムダ式」
	作成日：2022/12/12
	作成者：田中太郎
*/

import java.util.ArrayList;

public class J2Kad21B {
    public static void main( String[] args) {
        ArrayList <Point> pointList = new ArrayList<>();

        pointList.add( new Point() );
        pointList.add( new Point() );
        pointList.add( new Point() );
        pointList.add( new Point() );

        System.out.println( "更新前のデータを表示します！" );
        pointList.forEach( x -> x.printInfo() );
        System.out.println( "2倍します！" );
        pointList.forEach( x -> { x.x *= 2; x.y *= 2; } );
        System.out.println( "更新後のデータを表示します！" );
        pointList.forEach( x -> x.printInfo() );
    }
}
