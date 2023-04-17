public class Kad12_2{
	
	// enum ŒŒ‰tŒ^‚ğ’è‹`
	enum BloodType{A, B, O, AB}
	
	public static void main(String[] args){
		
		System.out.println("*** ŒŒ‰tŒ^•Ê‚Ì“Á’¥ ***");
		
		// ’è‹`‚µ‚½ŒŒ‰tŒ^‚Ì—ñ‹“Œ^‚ğ‘S‚Ä•\¦‚·‚é‚½‚ß‚Ìƒ‹[ƒv(Šg’£for•¶)
		for(BloodType bt : BloodType.values()){
			// ’è‹`‚µ‚½ŒŒ‰tŒ^‚Æ"Œ^"‚Æ‚¢‚¤•¶š—ñ‚ğ•\¦
			System.out.print(bt + "Œ^F");
			
			// ŒŒ‰tŒ^‚ğŒ³‚ÉğŒ•ªŠò(switct•¶)
			switch(){
			// AŒ^‚È‚ç
			case A:
				System.out.println("™{’ –Ê");
				// switch•¶‚©‚ç”²‚¯‚é
				break;
			// BŒ^‚È‚ç
			case B:
				System.out.println("ŒÂ«“I");
				// switch•¶‚©‚ç”²‚¯‚é
				break;
			// OŒ^‚È‚ç
			case O:
				System.out.println("‘å‚ç‚©");
				// switch•¶‚©‚ç”²‚¯‚é
				break;
			// ABŒ^‚È‚ç
			case AB:
				System.out.println("“VË”§");
				// switch•¶‚©‚ç”²‚¯‚é
				break;
			}
		}
	}
}
