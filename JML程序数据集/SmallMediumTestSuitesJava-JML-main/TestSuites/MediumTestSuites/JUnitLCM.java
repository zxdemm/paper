
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

	@Test
	public void test7() {
		LCM a = new LCM();
		assertEquals(757366056, a.lcm(26856, 28201));
	}

	@Test
	public void test8() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(21824, 0));
	}

	@Test
	public void test9() {
		LCM a = new LCM();
		assertEquals(12419946, a.lcm(38934, 20097));
	}

	@Test
	public void test10() {
		LCM a = new LCM();
		assertEquals(492654342, a.lcm(-21377, -23046));
	}

	@Test
	public void test11() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(974744168, 1853188201));
	}

	@Test
	public void test12() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, -36032));
	}

	@Test
	public void test13() {
		LCM a = new LCM();
		assertEquals(589554324, a.lcm(38538, 30596));
	}

	@Test
	public void test14() {
		LCM a = new LCM();
		assertEquals(100124100, a.lcm(-8100, -37083));
	}

	@Test
	public void test15() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(978078464, 32580));
	}

	@Test
	public void test16() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-768, 0));
	}

	@Test
	public void test17() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 16628));
	}
}
