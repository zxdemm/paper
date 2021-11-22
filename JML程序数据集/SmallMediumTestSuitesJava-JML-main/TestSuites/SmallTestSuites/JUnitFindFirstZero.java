import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class JUnitFindFirstZero {
	@Test
	public void test() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {543781664, 1629508709, 1936990306, 2032157037, 1769104993, 1919443300, 542009708, 1769628004, 1701326346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int loc = a.FindFirstZero(array);

		if(loc != -1){
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for(int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}
	}
	@Test
	public void test1() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {};
		int loc = a.FindFirstZero(array);

		if(loc != -1){
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for(int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test2() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {543781664, 1629508709, 1936990306, 2032158829, 1769103632};
		int loc = a.FindFirstZero(array);

		if(loc != -1){
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for(int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test9() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1852339817, 1920362602, 809067375, 1702324323, 1718186085, 2003462518, 1768645988, 1667855983, 1780496222, 1378182774, 1752529223, 643123535, 1347041648, 1867131176, 640312690, 1786143333, 1797287529, 1869768040, 943286134, 1647916088, 862482025, 1797288546, 1815687220, 859384106, 1428703867, 745352496, 963210060, 1011699514, 1330325599, 710172198, 640308552, 1330530640, 1765373232, 961497677, 1263290698, 1210463799, 947480936, 1851924587, 1819240761, 1785215343, 1768977721, 1869179739, 762259312, 1785547048, 1430923306, 640316007, 1714713141, 1748264809, 1868904552, 2036820280, 1748251246, 863006567, 892627817, 1882220656, 1785738036, 1762287408, 761870384, 1380270678, 1347375685, 1247167055, 1531717458, 743134825, 808282425, 758658872, 947206449, 859141482, 1651012975, 1752054635, 1817070153, 1330661989, 2003329638, 1987671401, 1785034594, 1969647465, 1902204200};
		int loc = a.FindFirstZero(array);

		if(loc != -1){
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for(int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

}
