package npnnotation;

import junit.framework.TestCase;

public class testnpn extends TestCase {
	public void testcalc(){

		String[] tokens = new String[] { "1", "2", "3", "+", "-" };
		Calculation calc = new Calculation();
		assertEquals(-4,calc.calculate(tokens));
	}

}
