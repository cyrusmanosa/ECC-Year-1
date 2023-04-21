public class Kad12_Ex02 {
	enum BloodType {
		A("™{’ –Ê"), B("ŒÂ«“I"), O("‘å‚ç‚©"), AB("“VË”§");
		
		public String features;
		
		private BloodType(String features) {
			this.features = features;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*** ŒŒ‰tŒ^‚Ì“Á’¥I ***");
		for (BloodType bt : BloodType.values()) {
			System.out.println(bt + "Œ^F" + bt.features);
		}
	}
}
