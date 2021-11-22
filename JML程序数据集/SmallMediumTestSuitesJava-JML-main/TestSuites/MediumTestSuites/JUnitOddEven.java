
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOddEven{

	@Test
	public void test() {
		OddEven a = new OddEven();
		boolean result = a.isEven(1416128883);
		assertEquals(false, result);
		result = a.isOdd(1416128883);
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		OddEven a = new OddEven();
		boolean result = a.isEven(135266304);
		assertEquals(true, result);
		result = a.isOdd(135266304);
		assertEquals(false, result);
	}

	@Test
	public void test2() {
		OddEven a = new OddEven();
		boolean result = a.isEven(625493849);
		assertEquals(false, result);
		result = a.isOdd(625493849);
		assertEquals(true, result);
	}

	@Test
	public void test3() {
		OddEven a = new OddEven();
		boolean result = a.isEven(134744072);
		assertEquals(true, result);
		result = a.isOdd(134744072);
		assertEquals(false, result);
	}

	@Test
	public void test4() {
		OddEven a = new OddEven();
		boolean result = a.isEven(1936946035);
		assertEquals(false, result);
		result = a.isOdd(1936946035);
		assertEquals(true, result);
	}

	@Test
	public void test5() {
		OddEven a = new OddEven();
		boolean result = a.isEven(2116110922);
		assertEquals(true, result);
		result = a.isOdd(2116110922);
		assertEquals(false, result);
	}
}
