import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReturnFileName{
	public static String Activate(int lineNumber) throws FileNotFoundException{
		String FP = "Data\\Config.shde";
		Scanner FileGuts = new Scanner(new File(FP));
		
		String PassFilePath = "";
		int WantedLineCount = lineNumber;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
				
		FileGuts.close();
		return PassFilePath;
	}
}
