class Sample03_1b{
	public static void main(String[] args){	
		/* 変数の宣言 */
		// long型で宣言を行い、値を代入(末尾にLが必要)
		long d = 1234567890123456678L;
		
		// char型で宣言を行い、値を代入
		char e = 'A';
		
		// float型で宣言を行い、値を代入(末尾にfが必要)
		float f = 9.87654321f;
		
		// double型で宣言を行い、値を代入
		double g = 9.87654321;
		
		// String型で宣言を行い、値を代入
		String h = "Hello!!";
		
		/* 表示 */
		// 文字列と変数dの値を表示
		System.out.println("long:" + d);
		
		// 文字列と変数eの値を表示
		System.out.println("char:" + e);
		
		// 文字列と変数fの値を表示
		System.out.println("float:" + f);
		
		// 文字列と変数gの値を表示
		System.out.println("double:" + g);
		
		// 文字列と変数hの値を表示
		System.out.println("String:" + h);	
	}
}