class Fuku15c{
	public static void main(String args[]){
		String moji1 = "1";
		String moji2 = "2";
		System.out.println( show(moji1,moji2) );
	}
	
	public static int show(String str1,String str2){
		return Integer.parseInt(str1) + Integer.parseInt(str2);
	}
}
