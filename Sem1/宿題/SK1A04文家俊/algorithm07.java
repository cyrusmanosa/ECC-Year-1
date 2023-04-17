class algorithm07{
	public static void main(String[] args){	
	for (int i=2; i<=100 ; i++) {
		boolean K = true;
		
		for (int j=2; j<i; j++) {
			if (i%j ==0) {
				K = false;
				break;
			}
		}
		
		if (K) {
			System.out.println(i + "");
		}
		
	}
	
	}
}
