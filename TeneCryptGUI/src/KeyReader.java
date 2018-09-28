import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class KeyReader {
	KeyReader(){	}
	
	public static String Activate() throws IOException{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String FinalKey = null;

		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts1 = new Scanner(FF);
		
		String FileName = null;
		int WantedLineCount = 5;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			FileName = FileGuts1.nextLine() + ".shde";
		}
		FileName = "Data\\" + FileName;
		File AllKeyFile = new File(FileName);

		boolean DoesItExist = new File(FileName).isFile();
		if(DoesItExist == false){
			
			PrintWriter output1 = new PrintWriter(new FileWriter(AllKeyFile, true));
			System.out.println("You have no keys stored, enter key owner's name now:");
			String Name = input.nextLine();
			System.out.println("Please enter the key:");
			String Key = input.nextLine();
			String FormattedOutput = Name + " - " + Key;
			output1.println(FormattedOutput);
			output1.close();
		}
		if(DoesItExist == true){
			Scanner FileGuts = new Scanner(AllKeyFile);
			
			System.out.println("ID's:");
			for(;;){
				String FullLine1 = FileGuts.nextLine();
				StringTokenizer st1 = new StringTokenizer(FullLine1, " - ");
	
				String Token1 = st1.nextToken();
				System.out.print(Token1);
				
				boolean HasLine = FileGuts.hasNextLine();
				if(HasLine == true){
					System.out.print(", ");
				}
				if(HasLine == false){
					System.out.println();
					System.out.println();
					break;
				}
			}
			//String Key = "";
			String FullLine = "";
			for(int swoop = 0;swoop < 1;){
				Scanner FileGuts2 = new Scanner(AllKeyFile);
				System.out.println("What is the ID of the person associated with the message?");
				String IDChoice = input.nextLine();
				
				for(;FileGuts2.hasNextLine();){
					FullLine = FileGuts2.nextLine();
					
					StringTokenizer st = new StringTokenizer(FullLine, " - \n");
					
					String Token = st.nextToken();
					if(IDChoice.equalsIgnoreCase(Token)){
						FinalKey = st.nextToken();
						
						swoop = 1;
						break;
					}
					if(!FileGuts2.hasNextLine()){
						System.out.println("ID Not Found, Would You Like To Add One Now?(Y/N)");
						String choice = input.nextLine();
						if(choice.equalsIgnoreCase("Y")) {
							@SuppressWarnings("unused")
							String Activator = AddKey.Activate();
						}
						else {
							//do nothing
						}
					}
				}
				Scanner FileGuts3 = new Scanner(FF);
				
				String FileName1 = null;
				int WantedLineCount1 = 4;
				for(int LineCount = 0;!(WantedLineCount1==LineCount);LineCount++){
					FileName1 = FileGuts3.nextLine() + ".shde";
				}
				FileName1 = "Data\\" + FileName1;
				FileGuts3.close();
				FileWriter fw = new FileWriter(FileName1);
				PrintWriter output = new PrintWriter(fw);
				output.print(FinalKey);
				output.close();
				FileGuts2.close();
			}
			FileGuts.close();
		}
		FileGuts1.close();
		/*String Activator = "";//Change this so that it returns the key from the selected id
		return Activator;*/
		return FinalKey;
	}
}