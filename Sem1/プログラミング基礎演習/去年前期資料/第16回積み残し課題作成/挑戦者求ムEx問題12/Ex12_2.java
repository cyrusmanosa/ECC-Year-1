/*
enumの応用


enumの各要素に「特徴」に該当するデータを持たせるように改造し、プログラムを簡略化せよ。

①enumの改造
enum BloodType {
    A("几帳面"), B("個性的"), O("大らか"), AB("天才肌");

    public String features;				// 「特徴」文字列
		
    private BloodType(String features) {
        this.features = features;			// 各要素のfeaturesにカッコで指定された文字列を設定する
    }
}

②プログラムの簡略化
public static void main(String[] args) {
    System.out.println("*** 血液型の特徴！ ***");
    for (BloodType bt : BloodType.values()) {
	（簡略化すること）
    }
}



*/


public class Ex12_2 {
	enum BloodType {
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("*** 血液型の特徴！ ***");
		for () {
			System.out.println( + "型：" + );
		}
	}
}
