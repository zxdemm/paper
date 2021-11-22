
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitLinearSearch {

	@Test
	public void test() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 1667828298;
		int[] data = {1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694};
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
	public void test1() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 1852008714;
		int[] data = { 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667852109, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1767525708, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1701603694, 1667844685, 1280009582, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1651076707, 1766477132, 1063611497, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, -1989973686, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, -2039910813, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1266642025, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246587211, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009577, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 32767, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938048, 6515018, 1296845702, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667385933, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264910848, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818820864, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089};
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



