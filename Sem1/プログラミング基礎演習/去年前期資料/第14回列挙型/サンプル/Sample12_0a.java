class Sample12_0a{
	
	public static void main(String args[]){
		
		int typeCild = 0;
		int typeAdult = 1;
		int typeSenior = 2;
		
		int type = 0; // 0:子供  1:大人  2:シニア
		
		if(type == typeCild){
			System.out.println("子供です");
		}else if(type == typeAdult){
			System.out.println("大人です");
		}else if(type == typeSenior){
			System.out.println("シニアです");
		}
	}
}
