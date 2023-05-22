class JKad08S2{
	public static void main(String[] args){
		int[] a;
		a = new int[9];
		a[0] = 1;
		a[1] = 1;
		//‘«‚·for
		for(int i= 2; i<9; i++){
			// ”@‰ÊIŒW2ŽžŒó,A1{A0€
			// ”@‰ÊIŒW4ŽžŒó,A3{A2€
			a[i] = a[i -1] + a[i - 2];
		}
			
		for(int i=0; i<9; i++){
			//èûŽ¦ì—p
			System.out.println("‘æ" + (i+1) +" €F" + a[i]);
		}
	}
}