import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitBankAccount {
	@Test
	public void test111() {
		int result;
		int flag = 1;
		int option = 1;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 676154701);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1233999514);	
	}

	@Test
	public void test112() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 676154701);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 676154701);	
	}

	@Test
	public void test113() {
		int result;
		int flag = 2;
		int option = 1;
		int amount = 676154701;
		int balance = 557846605;
		int previousTransaction = 181218446;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 676154701);	
		}
		assertTrue("Balance is not correct", result == 1234001306);	
	}

	@Test
	public void test114() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 559089997;
		int balance = 557844813;
		int previousTransaction = 181213541;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}

	@Test
	public void test115() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 1296911693;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test116() {
		int result;
		int flag = 2;
		int option = 0;
		int amount = 1077952512;
		int balance = 4472896;
		int previousTransaction = 2950208;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 2950208);	
		}
		assertTrue("Balance is not correct", result == 4472896);	
	}

	@Test
	public void test117() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 1296911693;
		int balance = 1144468050;
		int previousTransaction = 152443644;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test118() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = -2171137;
		int balance = 560480256;
		int previousTransaction = -554377673;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test119() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 674647373;
		int balance = 557844813;
		int previousTransaction = 176156025;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -50);	
		}
		assertTrue("Balance is not correct", result == 557844763);	
	}

	@Test
	public void test120() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 727058425;
		int balance = 270834;
		int previousTransaction = -953069312;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test121() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = 1101374885;
		int balance = -336869360;
		int previousTransaction = 16;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 16);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test122() {
		int result;
		int flag = 2;
		int option = 7;
		int amount = -782283443;
		int balance = 553904205;
		int previousTransaction = 63796992;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 63796992);	
		}
		assertTrue("Balance is not correct", result == 553904205);	
	}

	@Test
	public void test123() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = -10223597;
		int balance = 1073807168;
		int previousTransaction = -1;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test124() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = 226492237;
		int balance = 557844813;
		int previousTransaction = 298662579;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -237816847);	
		}
		assertTrue("Balance is not correct", result == 320027966);	
	}

	@Test
	public void test125() {
		int result;
		int flag = 0;
		int option = 7;
		int amount = 993737787;
		int balance = 391075886;
		int previousTransaction = 211585759;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 944050902);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 944050902);	
	}

	@Test
	public void test126() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 609613;
		int balance = 557844845;
		int previousTransaction = 481302094;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -609613);	
		}
		assertTrue("Balance is not correct", result == 557235232);	
	}

	@Test
	public void test127() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}

	@Test
	public void test128() {
		int result;
		int flag = 0;
		int option = 9;
		int amount = -2103614307;
		int balance = 1239698784;
		int previousTransaction = 810365412;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test129() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 1295006867;
		int balance = 1296924672;
		int previousTransaction = 1296920141;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1295006871);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1917801);	
	}

	@Test
	public void test130() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = -205;
		int balance = 557844813;
		int previousTransaction = 179329459;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}

	@Test
	public void test131() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 235802126;
		int balance = 235802126;
		int previousTransaction = 235802126;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -231086084);	
		}
		assertTrue("Balance is not correct", result == 4716042);	
	}

	@Test
	public void test132() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 181222067);	
		}
		assertTrue("Balance is not correct", result == 22313792);	
	}

	@Test
	public void test133() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1296911693;
		int balance = 1296911693;
		int previousTransaction = 1296315946;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1296911693);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test134() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 1527384330;
		int balance = 177356928;
		int previousTransaction = 99106813;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 99106813);	
		}
		assertTrue("Balance is not correct", result == 177356928);	
	}

	@Test
	public void test135() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 2147478784;
		int balance = -603945857;
		int previousTransaction = 7030784;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test136() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = -268435455;
		int balance = 1082355556;
		int previousTransaction = 16777200;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1082355556);	
	}

	@Test
	public void test137() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = -1503355265;
		int balance = -336888063;
		int previousTransaction = 17169704;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test138() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 716485804;
		int balance = 65536;
		int previousTransaction = -1673489740;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1310);	
	}

	@Test
	public void test139() {
		int result;
		int flag = 0;
		int option = 5;
		int amount = -1;
		int balance = 557907967;
		int previousTransaction = -144;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test140() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 676154701;
		int balance = 264525;
		int previousTransaction = 210143;
			
		if(flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1){	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 210143);	
		}
		assertTrue("Balance is not correct", result == 7935);	
	}
}
