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
		
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		String WorkspaceFileName = null;
		int WantedLineCount = 1;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			WorkspaceFileName = FileGuts.nextLine() + ".shde";
		}
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
		
		FileWriter fw2 = new FileWriter(WorkspaceFileName);
		PrintWriter output2 = new PrintWriter(fw2);
		output2.print("");
		fw2.close();
		output2.close();
		
		/*System.out.println("Before hex: " + finallyDone);
		
		BigInteger toHex=new BigInteger(finallyDone, 10);
		String hexValue = toHex.toString(16);*/
		
		FileGuts.close();
		return finallyDone;
	}
}