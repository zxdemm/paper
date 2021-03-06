     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	 
     public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int num = 0;

		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1)
				num = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");				
			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		OddEven even = new OddEven();
		OddEven odd = new OddEven();
                even.isEven(num);
		even.isOdd(num);		 
	 }
      }
