import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class JUnitBubbleSort {

	@Test
	public void test() {
		BubbleSort a = new BubbleSort();
		int[] data = {1801658486, 1970370415, 626927146, 1765308776, 1847602798, 2003137130, 1746957881, 1769551929, 811955833, 1746953583, 1936815980};
		data = a.bubbleSort(data);
		for(int i = 0; i < data.length; i++)
			for(int j = i; j < data.length; j++) 
				assertTrue(data[i] <= data[j]);		
	}
}

