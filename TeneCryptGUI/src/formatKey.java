
public class formatKey {
	public static String Activate(String toFormat) {
		int chunkLength = 32;
		
		int toFormatLength = toFormat.length();
		int chunkCount = toFormatLength / chunkLength;
		
		String formatted = "";
		for(int a = 0; a != chunkCount; a++) {
			formatted += toFormat.substring(a * chunkLength, (a + 1) * chunkLength) + "\n";
		}
				
		return formatted;
	}
}