import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitGCD {

	@Test
	public void test() {
		GCD a = new GCD();
		assertEquals(839516160, a.gcd(839516160, 0));
	}

	@Test
	public void test1() {
		GCD a = new GCD();
		assertEquals(2, a.gcd(1912602640, 1198682738));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(67108864, a.gcd(-67108864, 0));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1769473, 301793282));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(360, a.gcd(2075703480, -1649035080));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(2129664, a.gcd(2129664, 0));
	}

	@Test
	public void test7() {
		GCD a = new GCD();
		assertEquals(16777216, a.gcd(0, -16777216));
	}
}
