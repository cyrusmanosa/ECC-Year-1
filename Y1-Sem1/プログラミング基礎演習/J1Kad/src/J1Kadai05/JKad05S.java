class JKad05S{
	public static void main(String[] args){
		double a = Math.random();
		System.out.println("æ“¾‚µ‚½—”" + a);
		
		double b = ((double)Math.round(a * 10))/10;
		System.out.println("¬”‘æ1 ˆÊ‚ÅlÌŒÜ“ü" + b);
		
		double c = ((double)Math.round(a * 100))/100;
		System.out.println("¬”‘æ2 ˆÊ‚ÅlÌŒÜ“ü" + c);
		

		double d = ((double)Math.round(a * 1000))/1000;
		System.out.println("¬”‘æ3 ˆÊ‚ÅlÌŒÜ“ü" + d);
	}
}