import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitLCM {

	@Test
	public void test() {
		LCM a = new LCM();
		assertEquals(192441312, a.lcm(8883, 21664));
	}

	@Test
	public void test1() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(14272, 0));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(819324174, a.lcm(30707, 26682));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(761896320, a.lcm(25329, -30080));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(7416036, a.lcm(-15228, -17532));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(152076287, 2320));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}
}
