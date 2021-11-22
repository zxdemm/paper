import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitLeapYear {

	@Test
	public void test() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1416128883));
	}

	@Test
	public void test1() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1694498816));
	}

	@Test
	public void test2() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (100659200));
	}

	@Test
	public void test3() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (2106384300));
	}
}
