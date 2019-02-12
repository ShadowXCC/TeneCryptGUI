import java.io.IOException;

public class decryptLogic {
	decryptLogic(){	}
	public static String Activate(String toDecrypt) throws IOException{		
		String encoded = toDecrypt;
		System.out.println("Encoded: " + encoded);
		String unencoded = undoNinetyFourBaseUsingBigInt.Activate(encoded);
		System.out.println("Unencoded: " + unencoded);
		
		String decrypted = Decrypter.Activate(unencoded);
		
		String unconverted = UnConverter.Activate(decrypted);
		
		return unconverted;
	}
}