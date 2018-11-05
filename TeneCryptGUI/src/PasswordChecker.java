import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PasswordChecker {
	PasswordChecker(){	}
	
	public static Boolean Activate(String InputPass) throws FileNotFoundException{
		boolean check = false;
		String FP = "Data\\Config.shde";
		Scanner FileGuts = new Scanner(new File(FP));
		
		String PassFilePath = "";
		int WantedLineCount = 3;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
		PassFilePath = "Data\\"+ PassFilePath;
		Scanner sf1 = new Scanner(new File(PassFilePath));
		String Pass = sf1.nextLine();
		
		if(InputPass.equals(Pass)){
			check = true;
		}
		if(InputPass.equals(Pass)){	}
		sf1.close();
		FileGuts.close();
		return check;
	}
}