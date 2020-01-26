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
		
		int count=1;
		while(FileGuts.hasNextLine()){
			keysString = keysString + count + ". " + FileGuts.nextLine() + "\n";
			count++;
		}
				
		FileGuts.close();
		return keysString;
	}
}