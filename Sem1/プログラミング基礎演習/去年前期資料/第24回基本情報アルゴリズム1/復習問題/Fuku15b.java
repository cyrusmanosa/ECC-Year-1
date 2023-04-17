class Fuku15b{
	public static int countUp(int count){
		count += 10;
		return count;
	}
	
	public static void main(String[] args){
		int count = 1;
		for(int i=0; i<5; i++){
			countUp(count);
		}
		System.out.println(count);
	}
}
