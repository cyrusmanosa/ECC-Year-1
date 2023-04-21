/*
enumの応用

①enumを以下のように改造せよ。

enum Month {
    JANUARY, FEBRUARY, MARCH,
    APRIL, MAY, JUNE,
    JUKY, AUGUST, SEPTEMBER,
    OCTOBER, NOVEMBER, DECEMBER
}

	↓

enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3),
    APRIL(4), MAY(5), JUNE(6),
    JUKY(7), AUGUST(8), SEPTEMBER(9),
    OCTOBER(10), NOVEMBER(11), DECEMBER(12);
		
    public int month;		// enumの各要素にmonthというデータを持たせる
		
    private Month(int month) {
        this.month = month;	// 各要素のmonth（this.monthのこと）に値を設定する（JANUARY(1)であればカッコ内の1がJANUARYのmonthに設定される）
    }
}

②プログラムコードを以下のように改造せよ。

int month = 1;	//月
for(Month m : ～省略～){
    System.out.println (month + "月 = " + ～省略～);
    month++;	//月インクリメント
}

	↓

for(Month m : ～省略～){
    System.out.println (m.month + "月 = " + ～省略～);		// m.monthはmの持つmonthの値のこと
}

③Kad12_1と同じ結果になるか確認すること。


*/


public class Ex12_1 {
	enum Month {
	    JANUARY, FEBRUARY, MARCH,
	    APRIL, MAY, JUNE,
	    JUKY, AUGUST, SEPTEMBER,
	    OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		
		System.out.println("*** 列挙型定数を拡張for文で表示！ ***");
		int month = 1;	//月
		for (Month m : Month.values()) {
			System.out.println(month + "月 = " + m);
			month++;	//月インクリメント
		}
	}
}
