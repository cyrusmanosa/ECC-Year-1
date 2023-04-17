class Fuku15a{
	public static void countUp(int count){
		count += 10;
	}
	
	public static void main(String[] args){
		int count = 1;
		for(int i=0; i<5; i++){
			countUp(count);
		}
		System.out.println(count);
	}
}
