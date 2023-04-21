/*
＜実行結果＞
うるう年判定(1000~3000)
西暦＞1000
1000年はうるう年ではありません。
1001年はうるう年ではありません。
1002年はうるう年ではありません。
1003年はうるう年ではありません。
1004年はうるう年です。



*** 元のプログラム ***

import java.util.    ア    ;

public class FukuEx04_13{
	public static void main(String[] args){
		
		final int MIN = 1000;	//最小年数
		final int MAX = 3000;	//最大年数
		
		System.out.println("うるう年判定(" + MIN + "~" + MAX + ")");
		System.out.print("西暦＞");
		    ア     sc = new     ア    (System.in);
		int year =      イ     ;
		
		//入力値判定
		if(year        ウ        year){
			//無限ループ
			while(  エ  ){
				if(year    オ    && year %     カ     || year     キ    ){
					System.out.println(year + "年はうるう年です。");
					  ク  ;
				}else{
					System.out.println(year + "年はうるう年ではありません。");
				}
				  ケ  ;		//翌年へ
			}
		}else{
			System.out.println(          コ          );
		}
	}
}
*/


import java.util.    ア    ;

public class FukuEx04_13{
	public static void main(String[] args){
		
		final int MIN = 1000;	//最小年数
		final int MAX = 3000;	//最大年数
		
		System.out.println("うるう年判定(" + MIN + "~" + MAX + ")");
		System.out.print("西暦＞");
		    ア     sc = new     ア    (System.in);
		int year =      イ     ;
		
		//入力値判定
		if(year        ウ        year){
			//無限ループ
			while(  エ  ){
				if(year    オ    && year %     カ     || year     キ    ){
					System.out.println(year + "年はうるう年です。");
					  ク  ;
				}else{
					System.out.println(year + "年はうるう年ではありません。");
				}
				  ケ  ;		//翌年へ
			}
		}else{
			System.out.println(          コ          );
		}
	}
}
