package AJavaTest;

 public class Bridge {
 		String name;

         		public static void main(String[] args) {
        			Bridge b = new Bridge();

        			if(b.name == "")
            				b.name = "Brooklyn";

        			System.out.println(b.name);
        		}
	}

