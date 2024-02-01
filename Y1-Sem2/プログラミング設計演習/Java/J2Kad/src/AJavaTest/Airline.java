package AJavaTest;

	public class Airline {
 		String flightNumber;

         		public void printFlightNumber() {
        			System.out.println(flightNumber);
        		}

         		public static void main(String[] args) {
        			Airline a1 = new Airline();
        			Airline a2 = a1;
        			a1.flightNumber = "DAL027";
        			a2.flightNumber = "DAL305";

        			a1.printFlightNumber();
        			a2.printFlightNumber();
        		}
	}

