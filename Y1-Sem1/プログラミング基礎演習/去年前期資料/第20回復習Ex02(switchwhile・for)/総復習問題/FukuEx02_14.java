/*
	腕立てを行うfor文自体をfor文で繰り返し
	腕立て10回を3セット行うプログラムを完成させよ
	
	[実行結果]
	1セット目
	腕立て1回目
	腕立て2回目
	腕立て3回目
	.
	.
	.
	腕立て10回目
	2セット目
	腕立て1回目
	腕立て2回目
	腕立て3回目
	.
	.
	.
	腕立て10回目
	3セット目
	腕立て1回目
	腕立て2回目
	腕立て3回目
	.
	.
	.
	腕立て10回目
	終了

*/


class FukuEx02_14{
	public static void main(String[] args){
		
		System.out.println("開始");
		
			System.out.println(    + "セット目");
			for(int i=1; i<=10; i++){
				System.out.println("腕立て" + i + "回目");
			}
			
		System.out.println("終了");
		
	}
}
