import java.io.IOException;

public class decryptLogic {
	decryptLogic(){	}
	public static String Activate(String toDecrypt) throws IOException{		
		String encoded = toDecrypt;
		String unencoded = undoNinetyFourBaseUsingBigInt.Activate(encoded);
		
		String decrypted = Decrypter.Activate(unencoded);
		
		String unconverted = UnConverter.Activate(decrypted);
		
		return unconverted;
	}
}