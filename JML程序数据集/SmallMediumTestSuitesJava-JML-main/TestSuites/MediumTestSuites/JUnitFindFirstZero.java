
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFindFirstZero {

	@Test
	public void test() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {543781664, 1629508709, 1936990306, 2032157037, 1769104993, 1919443300, 542009708, 1769628004, 1701326346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}
	}

	@Test
	public void test1() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test2() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {543781664, 1629508709, 1936990306, 2032158829, 1769103632};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test3() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {943154791, 1949316407, 1411786793, 710879275, 1599088751, 1533833262, 1836086895, 959263540, 1785558560, 991982190, 1882810997, 959475786, 1210730792, 1496872298, 1882924912, 1532717929, 808282485, 676284494, 1836071785, 1969893433, 947219055, 1833913421, 542137136, 1764569144, 810503243, 673534519, 909387102, 2033727840, 828407422, 2117482356, 1949788527, 1244276821, 1246580815, 1229596727, 908338472, 926443630, 1835618383, 963979816, 859062305, 1077964393, 1752131690, 1768648301, 1864586570, 1650947433, 1734883640, 963995753, 1869228328, 676677967, 589524841, 1852336441, 946497593, 1768759410, 1952608048, 1768631603, 1818062892, 876293152, 1265201258, 1832463722, 1798069099, 1868378217, 758147435, 1331636309, 640166229, 1249607209, 1431257674, 1428188460, 1819156587, 1768451944, 942684528, 1749635151, 1311342206, 2117302117, 875980405, 2036889186, 1768454471, 643705428, 1495684424, 1112428320, 1282108523, 1781545261, 1764304941, 172124519, 1647916842, 1195911464, 1246580575, 691562863, 810117688, 943207732, 825636148, 1852337975, 947206504, 1882732601, 1748580469, 943208543, 1596469305, 930441785, 758149168, 1347766824, 690845049, 963995754, 1852403817, 710486317, 808148797, 962537528, 1769302133, 1768908857, 2033739897, 808991081, 809006440, 2036035445, 943206461, 1059991405, 1869637992, 1782081871, 1310748475, 1816934989, 1248817209, 1781560633, 810887209, 1428648027, 1560960816, 761870384, 1764765033, 959264823, 943224121, 825439605, 1784834165, 1869114939, 1802260042, 1229934666, 1428695593, 1428760681, 1852533098, 1768976234, 1802449003, 1764764982, 875968817, 1768910441, 1869244728, 1785212985, 946367093, 959449691, 1701997680, 1651273586, 758145641, 1865446452, 1966094644, 893214003, 878390331, 1885039476, 757084231, 1430408777, 1430804774, 1499623029};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test4() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {511639552, 0, 8323072, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1350267904, 0, -1, 0, 2033727840, 828407422, 14196, 1949788527, 1620079616, 0, -1, -1, 926443374, 1835618383, 1888515072, 0, 0, 0, 1768648301, 1864586570, 1650947433, 1734883640, -1, 1869228328, 676677967, 589524841, 1852336441, 946497593, -520709589, 511639552, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1781545261, 1764304941, 172124519, 1647916842, 1195911464, 1246580575, 691562863, 810117688, 943207732, 825636148, 1852337975, 947206504, 1882732601, 1748580469, 943208543, 1596469305, 930441785, 758149168, 1347766824, 690845049, 963995754, 1852403817, 710486317, 808148797, 962537528, 1769302133, 1768908857, 2033739897, 808991081, 809006440, 2036035445, 943206461, 1059991405, 1869637992, 1782081871, 1310748475, 1816934989, 1248817209, 1781560633, 810887209, 1428648027, 1560960816, 761870384, 1764765033, 959264823, 943224121, 825439605, 1784834165, 1869114939, 1802260042, 1229934666, 1428695593, 1428760681, 1852533098, 1626511915, 511639552, 1895890944, 0, -670262485, 511639552};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test9() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1852339817, 1920362602, 809067375, 1702324323, 1718186085, 2003462518, 1768645988, 1667855983, 1780496222, 1378182774, 1752529223, 643123535, 1347041648, 1867131176, 640312690, 1786143333, 1797287529, 1869768040, 943286134, 1647916088, 862482025, 1797288546, 1815687220, 859384106, 1428703867, 745352496, 963210060, 1011699514, 1330325599, 710172198, 640308552, 1330530640, 1765373232, 961497677, 1263290698, 1210463799, 947480936, 1851924587, 1819240761, 1785215343, 1768977721, 1869179739, 762259312, 1785547048, 1430923306, 640316007, 1714713141, 1748264809, 1868904552, 2036820280, 1748251246, 863006567, 892627817, 1882220656, 1785738036, 1762287408, 761870384, 1380270678, 1347375685, 1247167055, 1531717458, 743134825, 808282425, 758658872, 947206449, 859141482, 1651012975, 1752054635, 1817070153, 1330661989, 2003329638, 1987671401, 1785034594, 1969647465, 1902204200};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test10() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1585381376, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}
	}
}
