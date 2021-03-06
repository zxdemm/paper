     import java.io.FileInputStream;
     import java.io.File;
     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	
     private static String JMLAddress ="jml"; 
     public static void main(String args[]) {
	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int num1 = 0;
		int num2 = 0;
		int intop = 0;
		char op = '+';
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				num1 = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				num2 = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				intop = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			op = (char)intop;	
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
		boolean precondition = RunRAC(num1, num2, op);
		
		if (precondition) {
			Calculator cal = new Calculator();
			cal.calculate(num1, num2, op);
		}	
	 }

	public static boolean RunRAC(int num1, int num2, char op) {
	     
		String _num1 = String.valueOf(num1);
		String _num2 = String.valueOf(num2);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		//driverArg = "JMLDriver " + _size + " >log.txt 2>&1";
		driverArg = "JMLDriver " + _num1 + " " + _num2 + " " + "\\"+ op;  //we add a backslash before the character. Some special characters like & and ' were making problems for running in the JMLDriver.
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(JMLAddress));
		Process process = null;
		boolean result = false;
		try {
			process = builderProg.start();
			process.waitFor();
			result = process.exitValue() == 0;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
     }
}
