public class Kad12_Ex01 {
	enum Month {
		JANUARY(1),
		FEBRUARY(2),
		MARCH(3),
		APRIL(4),
		MAY(5),
		JUNE(6),
		JUKY(7),
		AUGUST(8),
		SEPTEMBER(9),
		OCTOBER(10),
		NOVEMBER(11),
		DECEMBER(12);
		
		public int month;
		
		private Month(int month) {
			this.month = month;
		}
	}

	public static void main(String[] args) {
		System.out.println("*** óÒãìå^íËêîÇägí£forï∂Ç≈ï\é¶ÅI ***");
		
		for (Month m : Month.values()) {
			System.out.println(m.month + "åé = " + m);
		}
	}
}
