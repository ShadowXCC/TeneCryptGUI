import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CDKeyCheck {
	CDKeyCheck(){	}
	public static String Activate() throws IOException{
		String cdKey = "643-480-695";
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		
		String fileName = null;
		int WantedLineCount = 2;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			fileName = FileGuts.nextLine() + ".shde";
		}
		fileName = "Data\\" + fileName;
		
		boolean DoesItExist = new File(fileName).isFile();
		if(DoesItExist == false){
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter CD Key provided:");
			String inputcdKey = input.nextLine();
			
			if(cdKey.equals(inputcdKey)){
				System.out.println("Program Authenticated!");
				System.out.println();
				FileWriter fw = new FileWriter(fileName);
				PrintWriter output = new PrintWriter(fw);
				output.print(cdKey);
				output.close();
			}
			else{
				System.out.println("Invalid CD Key Input");
				System.exit(0);
			}
		}
		File CDKeyFile = new File(fileName);
		Scanner FileGuts1 = new Scanner(CDKeyFile);
		String FG = FileGuts1.nextLine();
		if(DoesItExist == true && !FG.equals(cdKey)){
			System.out.println("No pirating for you.");
			System.exit(0);
		}
		FileGuts.close();
		FileGuts1.close();
		String Activator = "";
		return Activator;
	}
}