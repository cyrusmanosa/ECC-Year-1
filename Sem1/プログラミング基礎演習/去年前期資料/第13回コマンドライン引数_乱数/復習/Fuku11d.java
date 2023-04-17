class Fuku11d{
	public static void main(String[] args){
		int numsList[][] = {{10,20,30},
						{40,50,60}};
		int total = 0;
		for(int nums[] : numsList){
			for(int num : nums){
				total += num;
			}
		}
		System.out.println("çáåv:" + total);
	}
}
