import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class JUnitSmallest {

	@Test
	public void test() {
		Smallest a = new Smallest();
		int[] data = {1179076714, 963209272, 946304633, 1296775755, 959474288, 1869442667, 1651930486, 962797678, 543780712, 2034780747, 1278877804, 1819044972, 1819044972, 1819044972, 1819044972, 1819044972, 1819044972, 1243631178, 541738032, 943150410, 1294428778, 1785358954, 1785358954, 1785350987, 1263225675, 1263225675, 1263225675, 1263225675, 1263225675, 173759822, 543825952, 707406378, 707414082, 1248538221, 741290101, 963276911, 992424243, 909527886, 1249272692, 930428533, 1751805518, 1212827721, 1229601612, 1835691835, 1785229163, 745283688, 1769302585, 808269881, 1969909869, 1663068777, 1882942252, 1819506763, 1229475407, 1228622411, 741487412, 892745520, 943274040, 943208504, 943208504, 943208504, 943208504} ;
		int min_loc = a.Smallest(data);
		int length_data = data.length;
		for (int i = 0 ; i < length_data; i++)
			assertTrue(data[min_loc] <= data[i]);	
	}

	@Test
	public void test1() {
		Smallest a = new Smallest();
		int[] data = {};
		int min_loc = a.Smallest(data);
		int length_data = data.length;
		for (int i = 0 ; i < length_data; i++)
			assertTrue(data[min_loc] <= data[i]);		
	}
}



