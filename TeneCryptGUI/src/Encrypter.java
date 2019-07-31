import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
//import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Scanner;

public class Encrypter {
	Encrypter(){	}
	public static String Activate() throws IOException{
		//String Key = KeyReader.Activate();//This grabs the key from the key storage file to be used in the encryption
		String finallyDone = null;
		
		Calendar cal = Calendar.getInstance();
		
		int lineNumber = 1;
		String WorkspaceFileName = ReturnFileName.Activate(lineNumber);
		WorkspaceFileName = "Temp\\" + WorkspaceFileName;
		
		int Second = cal.get(Calendar.SECOND) + 10;
		BigInteger SecondNum = new BigInteger(Integer.toString(Second));
		
		BigInteger SBONUMBER = new BigInteger("5647983335");
		// VARIABLE AREA END
		
		File WorkspaceFile = new File(WorkspaceFileName);
		Scanner sf = new Scanner(WorkspaceFile);
		BigInteger fileguts = new BigInteger(sf.nextLine());
		sf.close();//if not closed, nothing prints out when trying to decrypt
		
		BigInteger finalnumbers = fileguts.multiply(SecondNum);
		
		BigInteger finalfinalnumbers = finalnumbers.multiply(SBONUMBER);
		
		finallyDone = SecondNum + "" + finalfinalnumbers;
		
		FileWriter fw = new FileWriter(WorkspaceFileName);
		PrintWriter output = new PrintWriter(fw);
		output.print("");
		fw.close();
		output.close();
		
		/*System.out.println("Before hex: " + finallyDone);
		
		BigInteger toHex=new BigInteger(finallyDone, 10);
		String hexValue = toHex.toString(16);*/
		
		return finallyDone;
	}
}
