package J2Kad11;

import java.util.ArrayList;
public class J2Kad11C {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // データの格納
        System.out.println("データを格納します！");
        for ( int i = 0 ; i < 5; i++){
            int data = (int)(Math.random()*100);
            System.out.println("add:" + data);
            list.add(Integer.valueOf(data));
        }
        // データの表示
        System.out.println("データを表示します！");
        for (var data : list ){
            System.out.println("get: " + data);
        }
    }
}
