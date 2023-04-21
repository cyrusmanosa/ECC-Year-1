/*

＜実行結果＞
  |  月  |  火  |  水  |  木  |  金  |
--------------------------------------
1 | 国語 | 数学 | 国語 | 社会 | 理科 |
2 | 数学 | 理科 | 社会 | 国語 | 数学 |
3 | 社会 | 理科 | 理科 | 国語 | 数学 |
4 | 英語 | 社会 | 英語 | 英語 | 英語 |




元のプログラム

public class FukuEx04_14{
	public static void main(String[] args){
	
		//曜日
		 final char[] DAYS = {'月', '火', '水', '木', '金'};
		 //教科
		 final String[] SUBS = {"国語", "数学",   サ  ,   シ  ,   ス  };
		 //時間割
		 int[][] timeTable = {{0, 1, 0, 3, 2},
							 	  {     セ     },
								  {3, 2, 2, 0, 1},
								  {     ソ     }};
        
		//曜日表示
		 System.out.print("  |  ");
		 for( タ  day :   チ  ){
		     System.out.print(day + "  |  ");
		 }
		 //罫線表示
		 System.out.print("\n--------------------------------------");
		
		 //教科表示
		 for(int i = 0; i < timeTable.length; i++){
		     System.out.print("\n" +    ツ    + " | ");
		     for(int j = 0; j < timeTable    テ    ; j++){
			      System.out.print(          ト           + " | ");
		     }
		 }
	}
}
*/


public class FukuEx04_14{
	public static void main(String[] args){
	
		//曜日
		final char[] DAYS = {'月', '火', '水', '木', '金'};
		//教科
		final String[] SUBS = {"国語", "数学",   サ  ,   シ  ,   ス  };
		//時間割
		int[][] timeTable = {{0, 1, 0, 3, 2},
							 	  {     セ     },
								  {3, 2, 2, 0, 1},
								  {     ソ     }};
        
		//曜日表示
		 System.out.print("  |  ");
		 for( タ  day :   チ  ){
		     System.out.print(day + "  |  ");
		 }
		 //罫線表示
		 System.out.print("\n--------------------------------------");
		
		 //教科表示
		 for(int i = 0; i < timeTable.length; i++){
		     System.out.print("\n" +    ツ    + " | ");
		     for(int j = 0; j < timeTable    テ    ; j++){
			      System.out.print(          ト           + " | ");
		     }
		 }
	}
}
