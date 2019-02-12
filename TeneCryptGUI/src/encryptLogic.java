import java.io.IOException;

public class encryptLogic {
	encryptLogic(){	}
	public static String Activate(String toEncrypt) throws IOException{
		Converter.Activate(toEncrypt);
		
		String encrypted = Encrypter.Activate();
		
		String encoded = ninetyFourBaseUsingBigInt.Activate(encrypted);
		
		return encoded;
	}
}