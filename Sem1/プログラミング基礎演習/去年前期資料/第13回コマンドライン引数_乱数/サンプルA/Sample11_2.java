import java.util.Random;

class Sample11_2{
	public static void main(String args[]){
		Random rnd = new Random();
		int prize;
		
		for(int count=1; count<=3; count++){
			prize = rnd.nextInt(5)+1;
			System.out.println(count + "‰ñ–Ú:"+ prize  +"“™‚ª“–‚½‚è‚Ü‚µ‚½I");
		}
	}
}
