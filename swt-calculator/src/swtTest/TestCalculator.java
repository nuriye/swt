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
	public void AK1UK() {
		
		uk = true;
		us = false;
		cups = true;
		teaspoons = false;
		drops = false;
		liter = 1.0;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 4.0;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);
		
		// fail("Not yet implemented");
		
	}
	
	@Test
	public void AK2UK() {
		
		uk = true;
		us = false;
		cups = true;
		teaspoons = false;
		drops = false;
		liter = -2;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 7.0;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);		
	}
	
	@Test
	public void AK6UK() {
		
		uk = true;
		us = false;
		cups = true;
		teaspoons = false;
		drops = false;
		liter = 0;
		
		calc = new Calculator(liter, uk, us, cups, teaspoons, drops);
		
		double expected = 0;
		double res = calc.getCups();
		
		assertEquals(expected, res, 0);		
	}
	
	

}
