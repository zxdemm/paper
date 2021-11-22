import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class JUnitStudentEnrollment {
	@Test
	public void test() {
		int result;
		boolean option = false;
		int initialBalance = 816;
		boolean lateRegistration = false;
		int passedCredits = 57;
		int semesterCredits = 1;
		boolean debit = true;	
		int payment = 1969385316;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1969384500);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 57);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = 3367;
		boolean lateRegistration = false;
		int passedCredits = 76;
		int semesterCredits = 7;
		boolean debit = false;	
		int payment = 1764914496;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1729612841);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 76);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 2549;
		boolean lateRegistration = true;
		int passedCredits = 57;
		int semesterCredits = 1;
		boolean debit = false;	
		int payment = 1768842089;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2549);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 57);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = true;
		int initialBalance = 816;
		boolean lateRegistration = false;
		int passedCredits = 57;
		int semesterCredits = 1;
		boolean debit = true;	
		int payment = 1449291620;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 816);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 57);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 82;
		int semesterCredits = 0;
		boolean debit = false;	
		int payment = 14614528;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 0);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 82);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test5() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 64;
		int semesterCredits = 0;
		boolean debit = false;	
		int payment = 4849664;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 0);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 64);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test6() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 82;
		int semesterCredits = 8;
		boolean debit = false;	
		int payment = 14614528;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1696);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 82);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}
}
