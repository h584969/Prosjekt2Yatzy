package rulesTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import no.hvl.dat109.proj2.yatzy.services.rules.RuleSum;
import no.hvl.dat109.proj2.yatzy.services.rules.RulesADT;

public class Sum4Test {
	private static final RulesADT sumRule = new RuleSum(4);
	
	@Test
	public void RuleSum_3TFours_Returns12() {
		
		//Arrange
		int[] dices = new int[] {6, 3, 4, 4, 4};
		
		//Act
		int sum = sumRule.calculate(dices);
		
		//Assert
		assertEquals(12, sum);
	}
	
	@Test
	public void RuleSum_0Fours_Returns0() {
		
		//Arrange
		int[] dices = new int[] {3, 1, 5, 2, 6};
		
		//Act
		int sum = sumRule.calculate(dices);
		
		//Assert
		assertEquals(0, sum);
	}
	
	@Test
	public void RuleSum_5Fours_Returns20() {
		
		//Arrange
		int[] dices = new int[] {4, 4, 4, 4, 4};
		
		//Act
		int sum = sumRule.calculate(dices);
		
		//Assert
		assertEquals(20, sum);
	}
}
