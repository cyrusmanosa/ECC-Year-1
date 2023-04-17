class Fuku13a{	
	public static void main(String args[]){
		enum Animal{犬,猫,ハムスター};
		for(Animal animal : Animal.values()){
			System.out.println(animal+"は可愛い");
		}
	} 
}
