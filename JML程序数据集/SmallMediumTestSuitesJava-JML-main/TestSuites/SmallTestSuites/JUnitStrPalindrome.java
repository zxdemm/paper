import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class JUnitStrPalindrome {

	@Test
	public void test() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("UVby49cnboYHURyjtyuHGTlkVNhitrhNzzNhrtihNVklTGHuytjyRUHYobnc94ybVU");
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("dOU9rp");
		assertEquals(false, result);
	}
}
