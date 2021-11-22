import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver {

	@Test
	public void test() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(4346580746L, a.Driver(3, 543781664, 1629508709, 1936990306, 2032157037, (short)26994, 7377303457245700174L));
	}

	@Test
	public void test1() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(4032900904L, a.Driver(5, 543236095, 1933212, 1652109095, 1835622502, (short)24946, 7503268628606315625L));
	}

	@Test
	public void test2() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1456, a.Driver(0, 15040659, 25366528, 442862338, 65645, (short)364, 2517043135789139455L));
	}

	@Test
	public void test3() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1718052328, a.Driver(4, 858993460, 859045760, 13108, 858993460, (short)23, 72103773526294528L));
	}

	@Test
	public void test4() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(5793246152107622394L, a.Driver(2, 1769611369, 1932032544, 2138253567, 8388353, (short)27392, 965541025351270399L));
	}

	@Test
	public void test5() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(9178135550L, a.Driver(1, 1835627110, 1634887777, 1828716288, 8388449, (short)29286, 7021789536673857280L));
	}
}
