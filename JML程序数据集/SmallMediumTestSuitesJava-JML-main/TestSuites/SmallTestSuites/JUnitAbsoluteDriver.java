import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAbsoluteDriver {

	@Test
	public void test() {
		AbsoluteDriver a = new AbsoluteDriver((short)21608, 1769152617, 8295737305099236212L);
		a.driver();
		assertEquals(21608, a.sh);
		assertEquals(1769152617, a.i);
		assertEquals(8295737305099236212L, a.l);
	}

	@Test
	public void test1() {
		AbsoluteDriver a = new AbsoluteDriver((short)-24466, 1778327630, 7637939491528865384L);
		a.driver();
		assertEquals(24466, a.sh);
		assertEquals(1778327630, a.i);
		assertEquals(7637939491528865384L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)21608, 65536, -37720810451273116L);
		a.driver();
		assertEquals(21608, a.sh);
		assertEquals(65536, a.i);
		assertEquals(37720810451273116L, a.l);
	}

	@Test
	public void test3() {
		AbsoluteDriver a = new AbsoluteDriver((short)-14385, -943208505, -7133701809754865664L);
		a.driver();
		assertEquals(14385, a.sh);
		assertEquals(943208505, a.i);
		assertEquals(7133701809754865664L, a.l);
	}
}
