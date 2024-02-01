package J2Kad21;
/*
	課題名：J2Kad21B「コレクションとラムダ式」
	作成日：2022/12/12
	作成者：田中太郎
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

        System.out.println("更新前のデータを表示します！");
        pointList.forEach( x -> x.printInfo() );

        Collections.sort(pointList);
        System.out.println("並び替えました！");
        System.out.println("更新後のデータを表示します！");
        pointList.forEach( x -> x.printInfo() );
    }
}
