
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

	@Test
	public void test2() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("");
		assertEquals(true, result);
	}

	@Test
	public void test3() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("ebm");
		assertEquals(false, result);
	}

	@Test
	public void test4() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("nG7IcrhittihrcI7Gn");
		assertEquals(true, result);
	}

	@Test
	public void test5() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("T6ngtjBVh");
		assertEquals(false, result);
	}
}
