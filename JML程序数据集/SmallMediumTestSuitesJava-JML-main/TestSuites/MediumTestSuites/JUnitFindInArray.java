
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFindInArray {
	@Test
	public void test7() {
		
		int key = 1702259068;
		int[] array = {1852113151, -250806038, 606357089, 2132803718, 958627912, 965228909, 338504992, 1113681197, 757935405, 757935405, 756100374, 764766464, 16121934, 1701249024, 543461675, 174362923, 0, 0, 0, 0, 0};
		FindInArray a = new FindInArray(array, key);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == key);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != key);

			assertTrue("The value of array is not equal to key ", array[last] == key);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != key);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != key);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == false);
	}

	@Test
	public void test8() {
		
		int key = 930441058;
		int[] array = {543386221, 745302898, 1768448568, 812987443, 2032167030, 1852586863, 543842873, 758264693, 2033809001, 942803291, 1785667692, 662072431, 1848859449, 842214708, 1969844331, 1651384364, 156323656, 758733088, 1128874528, 1263949399, 776289110, 1196314703, 959657005, 1444956744, 1311516425, 1279936057, 1768451616, 1980312623, 776806468, 1330268217, 1177826119, 1331373883, 156062540, 1870163555};
		FindInArray a = new FindInArray(array, key);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == key);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != key);

			assertTrue("The value of array is not equal to key ", array[last] == key);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != key);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != key);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == false);
	}

	@Test
	public void test9() {

		int[] array = {1382744319, -224, 1980312623, 776806655, -40391, 758259829, 2036742493, 963997578, 1801615136, -14069504, 1210923273, 741286221, 541353472, 4192, 962416475, 1986756978, 1836458349, 996372330, 1331394155, -546149002, 560806755, 1869241956, 963063859, 878389110, 544029522, 1802779392, 469729057, 555819297, 555819292, 959984160, 1970890288, 1615536219, 509345758, -16521100, 943545633, 2147483647, 1970632053, 1949460785, 1752329529, 822766905, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		FindInArray a = new FindInArray(array);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == 0);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != 0);

			assertTrue("The value of array is not equal to key ", array[last] == 0);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == true);
	}

	@Test
	public void test11() {
		
		int key = -1244105600;
		int[] array = {-1258291200, 1689097107, -2121033837, -1986817133, -1819043949, -1819044973, -1819044955, -1257242624, 8414404, -914311781, -1817847792, 128, 1690604435, -1819044973, -1246391405, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		FindInArray a = new FindInArray(array, key);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == key);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != key);

			assertTrue("The value of array is not equal to key ", array[last] == key);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != key);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != key);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == false);
	}

	@Test
	public void test12() {

		int[] array = {909522486, 943208504, 808269360, 842020407, 758657840, 909457205, 842217261};
		FindInArray a = new FindInArray(array);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == 0);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != 0);

			assertTrue("The value of array is not equal to key ", array[last] == 0);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == false);
	}

	@Test
	public void test13() {
		
		int[] array = {889454648, 168034360, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		FindInArray a = new FindInArray(array);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == 0);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != 0);

			assertTrue("The value of array is not equal to key ", array[last] == 0);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == true);
	}

}
