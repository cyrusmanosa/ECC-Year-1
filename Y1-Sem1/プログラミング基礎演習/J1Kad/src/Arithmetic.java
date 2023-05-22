class Arithmetic{
	public static void main(String[]args){
		int apple = 13;
		int person = 4;
		int eat = apple / person;
		int rest = apple % person;
		System.out.println("eat\"" + eat);
		System.out.println("rest\""+rest);
		
		int a=5;
		int b=a+7;
		int c=a;
		
		a = b;
		b=c;
		System.out.println("a\t" + a);
		System.out.println("b\t" + b);
		System.out.println("c\t" + c);
	}
}