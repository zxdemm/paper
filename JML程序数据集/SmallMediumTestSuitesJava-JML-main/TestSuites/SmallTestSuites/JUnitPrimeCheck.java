import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPrimeCheck{

	@Test
	public void test() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(1416128883));
	}

	@Test
	public void test1() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(true, a.Prime(13883));
	}
}
