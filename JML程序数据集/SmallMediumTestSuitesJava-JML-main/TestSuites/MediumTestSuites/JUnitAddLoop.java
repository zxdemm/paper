
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test() {
		AddLoop a = new AddLoop();
		assertEquals(1959910547, a.AddLoop(1416128883, 543781664));
	}

	@Test
	public void test1() {
		AddLoop a = new AddLoop();
		assertEquals(1711276032, a.AddLoop(1711276032, 0));
	}

	@Test
	public void test2() {
		AddLoop a = new AddLoop();
		assertEquals(-370546200, a.AddLoop(-185273100, -185273100));
	}

	@Test
	public void test3() {
		AddLoop a = new AddLoop();
		assertEquals(1367047806, a.AddLoop(825439798, 541608008));
	}

	@Test
	public void test4() {
		AddLoop a = new AddLoop();
		assertEquals(-1979711488, a.AddLoop(-1979711488, 0));
	}

	@Test
	public void test5() {
		AddLoop a = new AddLoop();
		assertEquals(-1178304448, a.AddLoop(962740256, -2141044704));
	}

	@Test
	public void test6() {
		AddLoop a = new AddLoop();
		assertEquals(2107684527, a.AddLoop(740645204, 1367039323));
	}

	@Test
	public void test7() {
		AddLoop a = new AddLoop();
		assertEquals(1258291200, a.AddLoop(1258291200, 0));
	}

	@Test
	public void test8() {
		AddLoop a = new AddLoop();
		assertEquals(740580902, a.AddLoop(740645125, -64223));
	}
}
