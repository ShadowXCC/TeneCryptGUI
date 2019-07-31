import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class addKey {
	addKey(){	}
	
	public static String Activate(String name, String key) throws IOException{
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		
		String FilePath = "";
		int WantedLineCount = 5;
		for(int LineCount = 0;!(WantedLineCount == LineCount);LineCount++){
			FilePath = FileGuts.nextLine() + ".shde";
		}
		FilePath = "Data\\" + FilePath;
		FileGuts.close();
		
		File AllKeyFile = new File(FilePath);

		String FormattedOutput = name + " - " + key;
		
		PrintWriter output = new PrintWriter(new FileWriter(AllKeyFile, true));
		output.println(FormattedOutput);
		output.close();
		
		String Activator = "";
		return Activator;
	}
}