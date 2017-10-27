
public class timeCalculator {
	

	public static void main(String[] args) {
	
		TextIO.putln("Welcome to the TimeCalculator!\nplease enter a duration in milliseconds:");
		long ms = 3452347890L;
		
		long restMs = ms%1000; 				//Ms Ausgabe
		long s = ms/1000; 					//S gesamt 
		int restS = (int) s%60; 			//S Ausgabe
		int min = (int) s/60; 				//Min gesamt 
		int restMin = min%60; 				//Min Ausgabe
		int h = min/60; 					//H gesamt
		int restH = h%24; 					//H Ausgabe
		int d = h/24; 						//D Ausgabe
	
		TextIO.putf("%8s", "days ");
		TextIO.putf("%d \n", d);
		
		TextIO.putf("%8s", "hours ");
		TextIO.putf("%d \n", restH);
		
		TextIO.putf("%8s", "minutes ");
		TextIO.putf("%d \n", restMin);
		
		TextIO.putf("%8s", "seconds ");
		TextIO.putf("%d \n", restS);
		
		TextIO.putf("%8s", "ms ");
		TextIO.putf("%d \n", restMs);
		
	}

}












