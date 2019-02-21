import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//All this does is hash the given string and return the string, can be used for both password creation and password checking
public class hasher{
	hasher(){	}

	public static String Activate(String toHash) {
		try{
			// getInstance() method is called with algorithm SHA-1 
			MessageDigest md = MessageDigest.getInstance("SHA-1"); 
	  
			// digest() method is called to calculate message digest of the input string 
			// returned as array of byte 
			byte[] messageDigest = md.digest(toHash.getBytes()); 
	  
			// Convert byte array into signum representation 
			BigInteger no = new BigInteger(1, messageDigest); 

			String hashtext = no.toString();
			/*// Convert message digest into hex value 
			String hashtext = no.toString(16); 
	  
			// Add preceding 0s to make it 32 bit 
			while(hashtext.length() < 32){ 
				hashtext = "0" + hashtext; 
			}*/
	  
			// return the HashText
			String reducedHashText = ninetyFourBaseUsingBigInt.Activate(hashtext);
			return reducedHashText; 
		} 
	  
		// For specifying wrong message digest algorithms 
		catch (NoSuchAlgorithmException e) { 
			throw new RuntimeException(e); 
		}
	}
}