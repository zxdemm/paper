
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitLinearSearch {

	@Test
	public void test1() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 544357221;
		int[] data = {1986488640, 594503786, 1986749755, 1718515312, 1868919402, 1735422575, 1768580982, 909392184, 1868721766, 1835362662, 1852520760, 640706665, 1920364400, 1919578228, 1651927402, 1915576880, 876163945, 1833584981, 1245198681, 1210328405, 944718409, 1261466726, 1987404405, 1785687404, 1718513014, 1969907304, 1987209589, 1753645161, 812131190, -2140638618, 1986622053, 1714976377, 1969844078, 1981836134, 1986947442, 1701344873, 1970431077, 1465013061, 1146241862, 1497844256, 32767, 1752588856, 1869181547, 539783728, 1865247024, 809056557, 808933680, 1531923280, 673871145, 1598639148, 659246415, 1279937871, 1246246985, 1212829264, 1987343734, 1717790830, 1852206198, 1894114789, -437918235, -437918235, -437918235, -437918235, -437918235, -437918346, 1679848002, 1229664372, 1719039330, 1969909613, 1818652269, 1987406438, 1752593001, 2037671736, 1282436713, 1785619045, 2003063139, 1969645623, 858941561, 1717725724, 845835108, 2003919461, 1718157311, -39582, 538994228, 1734501943, 1697933158, 943281241, 1197360708, 626931556, 892811568, 611660665, 963012469, 875387680, 1174405229, 544357221, 1970694713, 875787565, 812068146, 1534159474, 1769039464, 2004182291, 1651412329, 1076064104, 1786145637, 996568694, 1886348658, 1785165429, 1701802600, 1731735692, 1784309621, 926508904, 1953642551, 1719218297, 1919433020, 1702327650, 1718972261, 1751726190, 543372153, 963012469, 875387680, 1174405229};
		int loc = a.linearSearch(Search, data);
		if (loc != -1)
			assertTrue(data[loc] == Search);
		else {
			for (int element : data) {
    				if (element == Search) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}		
	}


	


	@Test
	public void test3() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 101058054;
		int[] data = {1785030504, 1752315961, 1736012389, 1768188534, 812083252, 859400808, 812071211, 1599106861, 1648194608, 1768058425, 811755833, 811737195, 1869311085, 543897142, 171276601, 946155638, 1748512869, 1752576032, 1802335776, 1853188214, 1853253664, 959280441, 762272560, -1871353299, 1919245686, 1866022189, 1030059634, 1646293606, 1948279410, 1735680544, 1953655852, 544369467, 1853189992, 1986148463, 1769106208, 745681007, 761868336, 960048432, 928599884, 1246580554, 1211648328, 1246646390, 1953855078, 1667772507, 1330335784, 712321375, 1229728807, 1263357772, 1246580554, 1211648328, 1246646390, 1953855078, 1667788398, 1718449776, 1916368231, 1982886517, 859124020, 892613386, 842020405, 724384057, 942352943, 712140150, 1919250281, 1969776441, 926447481, 1718039603, 929589877, 1847621230, 544367976, 930703463, 926167662, 1785095534, 1717772395, 1768975933, 760965483, 1026375014, 1646291248, 1701405245, 1768844653, 1785686579, 643704356, 591413342, 1379285304, 1869178400, 1987472752, 1882942050, 1785292394, 543307831, 908418613, 1746955630, 1767669002, 657406830, 1646291043, 2051101042, 1681274423, 1684223543, 1701986156, 745303915, 1651664239, 1886021474, 959476272, 825570100, 825570872, 878004552, 1195925034, 626934821, 1949773104, 1596598613, 1244215607, 2033219954, 1748581477, 2004181606, 1970234728, 1765305888, 1668643174, 926167913, 1919378999, 1949905459, 1718120044, 2085628783, 1026387757, 1915776874, 1986145650, 1986949229, 1650881895, 1550742898, 1718056565, 1919448423, 1986999142, 1781494390, 1735354738, 1785165375, 1047358057, 1919575655, 862991407, 775120742, 1848928357, 1852797446, 101058054};
		int loc = a.linearSearch(Search, data);
		if (loc != -1)
			assertTrue(data[loc] == Search);
		else {
			for (int element : data) {
    				if (element == Search) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}		
	}


	@Test
	public void test5() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 975187978;
		int[] data = {-2004942848, -1872046964, 794165248, -1872046964, 794165248, 1634956383, 1970300001, 1952784416, 538976288, 540680241, 892743731, 943142199, 873096821, 2054841714, 1601202532, 538976288, 538976288, 975188278, 876097803, 1668899692, 1702059876, 1869505824, 538976288, 538982944, 805987704, 1701016415, 1685024357, 538976288, 538976288, 975189040, 174422117, 1668505456, 1701994355, 1700995104, 538976314, 540095022, 812935283, 1600545142, 1869768036, 538976288, 540680241, 175137140, 1752391526, 1869966948, 538976288, 538976314, 540019312, 1635018867, 1600744816, 1869771877, 1679826976, 540680240, 174940536, 1600415088, 1952981024, 538976288, 538976314, 540084835, 1970429808, 1635018784, 538976288, 538976288, 540680240, 175138158, 1684631143, 1600545142, 1931485216, 538976314, 540084848, 1701733481, 1852268404, 1869898092, 538976288, 540680241, 175530354, 1767989868, 1700753505, 1953002272, 538976314, 540084851, 1952539241, 1818850425, 538976288, 538976288, 540680248, 908998199, 621437545, 1953325424, 1600353895, 538976288, 538976288, 975188014, 808592650, 1970170225, 1969577827, 1918989160, 1702043680, 538982944, 805991790, 1769043301, 1600676206, 1735598112, 538976288, 975187978, 1818325876, 1601200500, 1746935840, 538976288, 538982944, 805989473, 1937006435, 1918989160, 538976288, 538976288};

		int loc = a.linearSearch(Search, data);
		if (loc != -1)
			assertTrue(data[loc] == Search);
		else {
			for (int element : data) {
    				if (element == Search) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}		
	}


	@Test
	public void test8() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 1852993122;
		int[] data = {1380079178, 1230128450, 1230129778, 1751607666, 1869048167, 1786067253, 963602285, 1785162292, 1919231013, 1076965684, 842216549, 1684498021, 1919313717, 963143477};
		int loc = a.linearSearch(Search, data);
		if (loc != -1)
			assertTrue(data[loc] == Search);
		else {
			for (int element : data) {
    				if (element == Search) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}		
	}
}



