import java.io.IOException;
import java.math.BigInteger;

public class Decrypter {
	Decrypter()throws IOException{	}
	
	public static String Activate(String toDecrypt) throws IOException{
		//String Key = KeyReader.Activate();//This grabs the key from the key storage file to be used in the encryption				
				
		BigInteger SBONUMBER = new BigInteger("5647983335");
		// VARIABLE AREA END
		
		String decrypted = "";

		String OriginalToDecrypt = toDecrypt;
		
		BigInteger OriginalToDecryptNum = new BigInteger(OriginalToDecrypt.substring(2));
		BigInteger LeadingDecryptDigits = new BigInteger(OriginalToDecrypt.substring(0, 2));
		BigInteger UndividedNum = OriginalToDecryptNum.divide(LeadingDecryptDigits);
		BigInteger UndividedUndividedNum = UndividedNum.divide(SBONUMBER);
		String UndividedString = UndividedUndividedNum.toString();
		
		decrypted = UndividedString;
		return decrypted;
	}
}