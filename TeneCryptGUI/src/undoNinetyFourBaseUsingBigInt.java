import java.math.BigInteger;

public class undoNinetyFourBaseUsingBigInt{
	undoNinetyFourBaseUsingBigInt(){	}
	public static String Activate(String toUndo){
		String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
		BigInteger val = new BigInteger("0");
		BigInteger ninetyFour = new BigInteger("94");
		
		BigInteger d;
		for (int i = 0; i < toUndo.length(); i++){
			char c = toUndo.charAt(i);
			Integer myInteger = digits.indexOf(c);
			d = BigInteger.valueOf(myInteger.intValue());
			val = ninetyFour.multiply(val).add(d);
		}
		String unencoded = val.toString(10);
		return unencoded;
	}
}