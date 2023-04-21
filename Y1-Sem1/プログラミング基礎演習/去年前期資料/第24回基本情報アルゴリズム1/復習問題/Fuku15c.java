class Fuku15c{
	public static int countUp(){
		return 10;
	}
	
	public static void main(String[] args){
		int count = 1;
		for(int i=0; i<5; i++){
			count = countUp();
		}
		System.out.println(count);
	}
}
