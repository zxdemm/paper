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

		int range = 2000;
		int arraySize = 20;
		int i;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) {
				arraySize = ByteBuffer.wrap(bytes).getInt();
			}

			arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of the System.

			int array[] = new int[arraySize];

			for (i = 0; i < arraySize; i++) {  
				if (fis.read(bytes) != -1) {  
					array[i] = ByteBuffer.wrap(bytes).getInt();
				}						
			}

			boolean precondition = RunRAC(array);
		
			if (precondition) {
				FindFirstZero find = new FindFirstZero();
               			find.FindFirstZero(array);	
	         	}
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }
	 public static boolean RunRAC(int[] arr) {
	     
		String[] strs = new String[arr.length];	
		String arrArg = "";

        	for (int i = 0; i < arr.length; i++) {
            		strs[i] = String.valueOf(arr[i]);
       		}

		if (arr.length != 0) {
			arrArg = strs[0];
        		for (int i = 1; i < strs.length; i++) {
            			arrArg += " " + strs[i];
       			}
		}

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";
		driverArg = "JMLDriver " + arrArg;
		
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
