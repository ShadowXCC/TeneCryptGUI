import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddKey {
	AddKey(){	}
	
	public static String Activate() throws IOException{
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Scanner FileGuts2 = new Scanner(FF);
		
		String FilePath1 = null;  // AllKey
		int WantedLineCount1 = 5; // AllKey
		for(int LineCount1 = 0;!(WantedLineCount1 == LineCount1);LineCount1++){
			FilePath1 = FileGuts2.nextLine() + ".shde";
		}
		FilePath1 = "Data\\" + FilePath1;
		File AllKeyFile = new File(FilePath1);

		String Yes = "Y";
		String No = "N";
		
		PrintWriter output = new PrintWriter(new FileWriter(AllKeyFile, true));
		for(;;){
			System.out.println("Please enter name of the person associated with the key:");
			String Name = input.nextLine();
			System.out.println("Please enter the key:");
			String Key = input.nextLine();
			String FormattedOutput = Name + " - " + Key;
			output.println(FormattedOutput);
			output.close();
			
			System.out.println("Do you have another? "+ Yes + "/" + No);
			String UserAddKeyChoice = input.nextLine();
			if(UserAddKeyChoice.equalsIgnoreCase(Yes)){
			}
			if(UserAddKeyChoice.equalsIgnoreCase(No)){
				break;
			}
		}
		
		FileGuts2.close();
		String Activator = "";
		return Activator;
	}
}