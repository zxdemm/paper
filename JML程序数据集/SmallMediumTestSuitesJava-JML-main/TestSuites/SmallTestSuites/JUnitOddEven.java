import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOddEven {

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
}
