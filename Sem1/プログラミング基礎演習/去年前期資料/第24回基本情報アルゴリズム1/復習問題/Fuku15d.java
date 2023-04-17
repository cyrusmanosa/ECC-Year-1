class Fuku15d{
	public static int countUp(int num){
		return num += 10;
	}
	
	public static void main(String[] args){
		int count = 1;
		for(int i=0; i<5; i++){
			count = countUp(count);
		}
		System.out.println(count);
	}
}
