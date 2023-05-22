class test {
	public static void main(String[] args){
		for (int i = 2;i<= 100;i++){		//1Šù•s¥Ž¿É–ç•s¥˜aÉCŠˆÈœn2ŠJŽn
		boolean k = true; //”»ÐžŠŒ
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					k = false;  //”ñŽ¿É™Bfalse
					break;
				}
			}
				if(k){
				System.out.println(i + " ");
				}
		}
	}
}