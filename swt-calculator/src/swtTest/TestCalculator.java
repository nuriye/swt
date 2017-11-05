package swtTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import swtCalc.Calculator;


public class TestCalculator {
	
	swtCalc.Calculator calc;
	double liter;
	boolean uk;
	boolean us; 
	boolean cups;
	boolean teaspoons;
	boolean drops;
	
	@Before
	public void setUp() throws Exception {

		
	}
	
	@Test
	// output should be cups, teaspoons and drops
	public void AK1UK() {
		uk = true;
		us = false;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 1.0;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 4.0;
		//	double res = calc.getCups();
		
		//assertEquals(expected, res, 0);
	}
	
	@Test
	// output should be cups, teaspoons and drops
	public void AK1US() {
		uk = false;
		us = true;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 1.0;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 4.0;
		//double res = calc.getCups();
		
		//assertEquals(expected, res, 0);
	}

	@Test
	public void AK2UK() {
		uk = true;
		us = false;
		cups = true;
		teaspoons = false;
		drops = false;
		liter = -2.0;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = -7.0;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);
	}
	
	@Test
	public void AK2US() {
		
		uk = false;
		us = true;
		cups = true;
		teaspoons = false;
		drops = false;
		liter = -2.0;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = -8.0;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);	
	}
	
	@Test
	public void AK3UK() {
		
		uk = true;
		us = false;
		cups = false;
		teaspoons = true;
		drops = false;
		liter = 1.75;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 296.0;
		double res = calc.getTeaspoons();
		
		assertEquals(expected, res, 0);		
	}
	
	@Test
	public void AK3US() {
		
		uk = false;
		us = true;
		cups = false;
		teaspoons = true;
		drops = false;
		liter = 1.75;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 355.0;
		double res = calc.getTeaspoons();
		
		assertEquals(expected, res, 0);		
	}
	
	@Test
	public void AK4UK() {
		
		uk = true;
		us = false;
		cups = false;
		teaspoons = false;
		drops = true;
		liter = 3;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 60000;
		double res = calc.getDrops();
		
		assertEquals(expected, res, 0.1);		
	}
	
	@Test
	public void AK4US() {
		
		uk = false;
		us = true;
		cups = false;
		teaspoons = false;
		drops = true;
		liter = 3;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 60000;
		double res = calc.getDrops();
		
		assertEquals(expected, res, 0.1);		
	}
	
	@Test
	// output should be 2 cups 5 teaspoons
	public void AK5UK() {
		
		uk = true;
		us = false;
		cups = true;
		teaspoons = true;
		drops = false;
		liter = 0.5;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 6000.0;
		//double res = calc.getTeaspoons();
		
		//assertEquals(expected, res, 0);		
	}
	
	@Test
	// output should be 1 cups 36 teaspoons
	public void AK5US() {
		
		uk = false;
		us = true;
		cups = true;
		teaspoons = true;
		drops = false;
		liter = 0.5;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 6000.0;
		//double res = calc.getTeaspoons();
		
		//assertEquals(expected, res, 0);		
	}
	
	@Test
	// output should be 0 cups 0 teapsoons 0 drops
	public void AK6UK() {
		
		uk = true;
		us = false;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 0.00;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 0;
		//double res = calc.getCups();
		
		//assertEquals(expected, res, 0);		
	}
	
	@Test
	// output should be 0 cups 0 teapsoons 0 drops
	public void AK6US() {
		
		uk = false;
		us = true;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 0.00;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 0;
		//double res = calc.getCups();
		
		//assertEquals(expected, res, 0);		
	}
	
	@Test
	// input string "hello"
	public void UAK1() {
		
		uk = true;
		us = false;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 0.00;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		//double expected = 0;
		//double res = calc.getCups();
		
		//assertEquals(expected, res, 0);		
	}
	
	@Test
	public void UAK2UK() {
		
		uk = true;
		us = false;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 110000;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 387146;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);		
	}
	
	@Test
	public void UAK2US() {
		
		uk = false;
		us = true;
		cups = false;
		teaspoons = false;
		drops = false;
		liter = 110000;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 464943;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);		
	}
	
}
