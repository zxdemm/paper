import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1416128883, 543781664,')'));
	}
	
	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(983040, a.calculate(8323072, 7340032,'%'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(1, a.calculate(1164461381, 1162167621,'/'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(-268168653, a.calculate(1416198753, 1684367406,'-'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(1426512531, a.calculate(1418094451, 8418080,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(3276800, a.calculate(32768, 100,'*'));
	}
}
