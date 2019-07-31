import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class deleteKey {
	deleteKey(){	}
	
	public static String Activate(int lineNumber) throws IOException{
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
		Scanner FileGuts2 = new Scanner(AllKeyFile);
		
		ArrayList<String> holder = new ArrayList<String>();
		while(FileGuts2.hasNextLine()) {
			holder.add(FileGuts2.nextLine());
		}
		FileGuts2.close();
		
		holder.remove(lineNumber - 1);
		
		PrintWriter output = new PrintWriter(new FileWriter(AllKeyFile));
		for(int a = 0; a < holder.size(); a++){
			output.println(holder.get(a));
		}
		output.close();
		
		String Activator = "";
		return Activator;
	}
}