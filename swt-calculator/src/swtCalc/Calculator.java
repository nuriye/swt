package swtCalc;
/*
 * Conversion table
 * 
 * Source: https://www.unitconverters.net/
 * 
 * ===== UK =====
 * 1l = 20000 drops
 * 1 teaspoon = 118.38776042 drops
 * 1 cup = 48 teaspoon
 * 1 cup = 5682.6125 drops
 * 
 * ===== US =====
 * 1l = 20000 drops
 * 1 teaspoon = 98.578431875 drops
 * 1 cup = 48 teaspoon
 * 1 cup = 4731.76473 drops
 */


public class Calculator {
	
	private double userInputLiter;
	double drops;
	double teaspoons;
	double cups;
	
	/*
	 * constants
	 */
	
	// general conversions
	final double dropsInLiter = 20000;
	final double teaspoonsInCup = 48;
	
	// UK conversions
	final double dropsInCupUk = 5682.6125;
	final double dropsInTeaspoonUk = 118.38776042;
	
	// US conversions
	final double dropsInCupUs = 4731.76473;
	final double dropsInTeaspoonUs = 98.578431875;
	

	
	/* constructor */
	public Calculator(double userInputLiter, boolean unitSystemUk, boolean unitSystemUs,
			boolean inCups, boolean inTeaspoons, boolean inDrops) {
		super();
		this.userInputLiter = userInputLiter;
		setCups(0);
		setTeaspoons(0);
		setDrops(0);

		
		// see what should be calculated
		//UK
		
		//If All is true or ALL is FALSE
		if (unitSystemUk && inCups == false && inTeaspoons == false && inDrops == false) {
    		calcAllUk();
		}  else if (unitSystemUk && inCups && inTeaspoons && inDrops) {
    		calcAllUk(); 
    	} 
		// If Cups TRUE
		else if (unitSystemUk && inCups && inTeaspoons == false && inDrops == false) {
			calcCupsUk();
		} 
		// If Cups & Tsp TRUE
		else if (unitSystemUk && inCups && inTeaspoons && inDrops == false) {
    		calcCupsTspUk();
		} 
		// IF Cups & Drops
		else if (unitSystemUk && inCups && inTeaspoons == false && inDrops) {
    		calcCupsDropsUk();
		} 
		//If Tsp TRUE
		else if (unitSystemUk && inTeaspoons && inCups == false && inDrops == false) {
			calcTeaspoonsUk();
		} 
		// If Tsp & Drops TRUE
		else if (unitSystemUk && inTeaspoons && inCups == false && inDrops) {
			calcTspDrpsUk();
		} 
		
		//US
		//If All is true or ALL is FALSE
		else if (unitSystemUs && inCups == false && inTeaspoons == false && inDrops == false) {
		    calcAllUs();
		}  
		else if (unitSystemUs && inCups && inTeaspoons && inDrops) {
		    calcAllUs(); 
		 } 
		
		// If Cups TRUE
		else if (unitSystemUs && inCups && inTeaspoons == false && inDrops == false) {
			calcCupsUs();
		} 
		// If Cups & Tsp TRUE
		else if (unitSystemUs && inCups && inTeaspoons && inDrops == false) {
		    calcCupsTspUs();
		} 
		// IF Cups & Drops
		else if (unitSystemUs && inCups && inTeaspoons == false && inDrops) {
		    calcCupsDropsUs();
		} 
		//If Tsp TRUE
		else if (unitSystemUs && inTeaspoons && inCups == false && inDrops == false) {
			calcTeaspoonsUs();
		} 
		// If Tsp & Drops TRUE
		else if (unitSystemUs && inTeaspoons && inCups == false && inDrops) {
			calcTspDrpsUs();
		} 
		
		//BOTH for DROPS
		else if (inCups == false && inTeaspoons == false && inDrops) {
			setDrops(getLiterInDrops());
		}
	}
	
	
	
	/* 
	 * UK conversion to
	 * single unit cup
	 * single unit teaspoon
	 * all units
	 */
	public void calcCupsUk() {
		setCups((int) Math.round(getLiterInDrops()/dropsInCupUk));
	}
	
	public void calcTeaspoonsUk() {
		setTeaspoons((int) Math.round(getLiterInDrops()/dropsInTeaspoonUk));
	}
	
	public void calcAllUk() {
		setDrops(getLiterInDrops() % dropsInTeaspoonUk);
		setTeaspoons((getLiterInDrops()/dropsInTeaspoonUk) % teaspoonsInCup);
		setCups((getLiterInDrops()/(dropsInTeaspoonUk*teaspoonsInCup)));
	}
	
	public void calcCupsTspUk() {
		setTeaspoons((getLiterInDrops()/dropsInTeaspoonUk) % teaspoonsInCup);
		setCups((getLiterInDrops()/(dropsInTeaspoonUk*teaspoonsInCup)));
	}
	public void calcTspDrpsUk() {
		setDrops(getLiterInDrops() % dropsInTeaspoonUk);
		setTeaspoons((getLiterInDrops()/dropsInTeaspoonUk));
	}
	public void calcCupsDropsUk() {
		setDrops(getLiterInDrops() % dropsInCupUk);
		setCups((getLiterInDrops()/dropsInCupUk));
	}
	
	
	
	/* 
	 * US conversion to
	 * single unit cup
	 * single unit teaspoon
	 * all units
	 */
	public void calcCupsUs() {
		setCups((int) Math.round(getLiterInDrops()/dropsInCupUs));
	}
	
	public void calcTeaspoonsUs() {
		setTeaspoons((int) Math.round(getLiterInDrops()/dropsInTeaspoonUs));
	}
	
	public void calcAllUs() {
		setDrops(getLiterInDrops() % dropsInTeaspoonUs);
		setTeaspoons((getLiterInDrops()/dropsInTeaspoonUs) % teaspoonsInCup);
		setCups((getLiterInDrops()/(dropsInTeaspoonUs*teaspoonsInCup)));
	}
	
	
	
	public void calcCupsTspUs() {
		setTeaspoons((getLiterInDrops()/dropsInTeaspoonUs) % teaspoonsInCup);
		setCups((getLiterInDrops()/(dropsInTeaspoonUs*teaspoonsInCup)));
	}
	
	public void calcTspDrpsUs() {
		setDrops(getLiterInDrops() % dropsInTeaspoonUs);
		setTeaspoons((getLiterInDrops()/dropsInTeaspoonUs));
	}
	public void calcCupsDropsUs() {
		setDrops(getLiterInDrops() % dropsInCupUs);
		setCups((getLiterInDrops()/(dropsInCupUs)));
	}
	


	/* getter */
	public double getUserInputLiter() {
		return userInputLiter;
	}
	
	public int getLiterInDrops() {
		return (int) (getUserInputLiter() * dropsInLiter);
	}

	public double getDrops() {
		return drops;
	}

	public double getTeaspoons() {
		return teaspoons;
	}

	public double getCups() {
		return cups;
	}
	
	
	
	/* setter */
	public void setDrops(double drops) {
		this.drops = drops;
	}

	public void setTeaspoons(double teaspoons) {
		this.teaspoons = teaspoons;
	}

	public void setCups(double cups) {
		this.cups = cups;
	}
	
	
	
	
	
	
	


	


}
