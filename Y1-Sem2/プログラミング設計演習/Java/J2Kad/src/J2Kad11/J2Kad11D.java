package J2Kad11;

import java.util.ArrayList;
public class J2Kad11D {
    public static void main(String[] args) {
        ArrayList<Monster> M  = new ArrayList<>();
        for ( int i = 0; i < Monster.size(); i++){ M.add( new Monster() );}

        System.out.println("データを格納します！");
        for ( Monster i : M){ System.out.println("add：" + i); }
        System.out.println("データを表示します！");
        for (Monster data : M) { System.out.println("get:" + data); }
    }
}