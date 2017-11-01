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
    	if (unitSystemUk && inCups == false && inTeaspoons == false && inDrops == false) {
    		System.out.println("Du möchtest UK all berechnen");
    		calcAllUk();
		} else if (unitSystemUs && inCups == false && inTeaspoons == false && inDrops == false) {
			System.out.println("Du möchtest US all berechnen");
			calcAllUs();
		} else if (unitSystemUk && inCups) {
			System.out.println("Du möchtest UK Cups berechnen");
			calcCupsUk();
		} else if (unitSystemUs && inCups) {
			System.out.println("Du möchtest US Cups berechnen");
			calcCupsUs();
		} else if (unitSystemUk && inTeaspoons) {
			System.out.println("Du möchtest UK Teaspoons berechnen");
			calcTeaspoonsUk();
		} else if (unitSystemUs && inTeaspoons) {
			System.out.println("Du möchtest US Teaspoons berechnen");
			calcTeaspoonsUs();
		} else if (inDrops) {
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
