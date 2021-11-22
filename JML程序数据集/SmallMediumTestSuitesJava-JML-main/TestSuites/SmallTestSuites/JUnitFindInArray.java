import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFindInArray {

	@Test
	public void test11() {
		
		int key = -1244105600;
		int[] array = {-1258291200, 1689097107, -2121033837, -1986817133, -1819043949, -1819044973, -1819044955, -1257242624, 8414404, -914311781, -1817847792, 128, 1690604435, -1819044973, -1246391405, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		FindInArray a = new FindInArray(array, key);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if(first != -1){
			assertTrue("The value of array is not equal to key ", array[first] == key);	
			for(int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != key);

			assertTrue("The value of array is not equal to key ", array[last] == key);	
			for(int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != key);
		}
		else {
			for(int i = 0; i < array.length; i++)
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

		if(first != -1){
			assertTrue("The value of array is not equal to key ", array[first] == 0);	
			for(int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != 0);

			assertTrue("The value of array is not equal to key ", array[last] == 0);	
			for(int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != 0);
		}
		else {
			for(int i = 0; i < array.length; i++)
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

		if(first != -1){
			assertTrue("The value of array is not equal to key ", array[first] == 0);	
			for(int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != 0);

			assertTrue("The value of array is not equal to key ", array[last] == 0);	
			for(int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != 0);
		}
		else {
			for(int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}

		assertTrue("There is a zero value but the method did not find it", moreThanOneKey == true);
	}
}
