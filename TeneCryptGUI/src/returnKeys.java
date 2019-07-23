import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class returnKeys {
	returnKeys(){	}
	
	public static String Activate() throws FileNotFoundException {
		//ArrayList<String> keys = new ArrayList<String>();
		String keysString = "";
		
		int lineNumber = 5;
		String FP = ReturnFileName.Activate(lineNumber);
		FP = "Data\\"+ FP;
		Scanner FileGuts = new Scanner(new File(FP));
		
		while(FileGuts.hasNextLine()){
			keysString = keysString + FileGuts.nextLine() + "\n";
		}
				
		FileGuts.close();
		return keysString;
	}
}