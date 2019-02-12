import java.math.BigInteger;

public class ninetyFourBaseUsingBigInt{
	ninetyFourBaseUsingBigInt(){	}
	public static String Activate(String toConvert) { 
		BigInteger N = new BigInteger(toConvert);
		
		BigInteger zero = new BigInteger("0");
		
		char values[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'};
		StringBuilder builder = new StringBuilder();
		BigInteger base = new BigInteger("94");
		while (!N.equals(zero)) {
			BigInteger remainder = N.mod(base);
			builder.append(values[remainder.intValue()]);
			N = N.divide(base);
		}

	    return builder.reverse().toString();
	}
}