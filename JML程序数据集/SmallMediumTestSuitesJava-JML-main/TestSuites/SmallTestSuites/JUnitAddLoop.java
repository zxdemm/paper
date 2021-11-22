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
}
