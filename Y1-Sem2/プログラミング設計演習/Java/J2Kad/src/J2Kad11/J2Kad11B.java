package J2Kad11;/*
	課題名：J2Kad11C「ラッパークラス」
	作成日：2022/11/07
	作成者：田中太郎
*/
import java.util.HashMap;

public class J2Kad11B {
    public static void main(String[] args) {
        HashMap<String,Integer> HB = new HashMap<>();
        HB.put( "ハンバーガー" , 150 );
        HB.put("チーズバーガー",180);
        HB.put("ビッグマック",410);

        // データの格納
        System.out.println("ECC バーガーへようこそ！");
        System.out.println("メニューを表示します！");

        for ( var Key : HB.keySet()){
            System.out.println(Key + " : " + HB.get(Key) + "円");
        }
    }
}
