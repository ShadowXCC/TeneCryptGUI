import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AllKey{
	void Allkey(){	}
		
	public static String Activate() throws IOException{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String MKButton = "1";
		String AKButton = "2";
		String VKButton = "3";
		String CButton = "X";
		String WIPEKEY = "9";
		String Yes = "Y";
		String No = "N";
		
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		Scanner FileGuts2 = new Scanner(FF);
		
		String FilePath = null;   // PubKey
		String FilePath1 = null;  // AllKey
		int WantedLineCount = 6;  // PubKey
		int WantedLineCount1 = 5; // AllKey
		for(int LineCount = 0;!(WantedLineCount == LineCount);LineCount++){
				FilePath = FileGuts.nextLine() + ".shde";
		}
		FilePath = "Data\\" + FilePath;
		for(int LineCount1 = 0;!(WantedLineCount1 == LineCount1);LineCount1++){
				FilePath1 = FileGuts2.nextLine() + ".shde";
		}
		FilePath1 = "Data\\" + FilePath;
		File AllKeyFile = new File(FilePath1);
		
		for(;;){
			System.out.print("Press " + MKButton + " for your public key. Press " + AKButton + " to add a key.");
			boolean DoesExist = AllKeyFile.exists();
			boolean IsCleared = AllKeyFile.exists();
			if(DoesExist){
				System.out.print(" Press " + VKButton + " to view all keys.");
			}
			System.out.print(" Press " + CButton + " to go back to the main menu.");
			if(IsCleared){
				System.out.print(" Press " + WIPEKEY + " to clear all data.");
			}
			System.out.println();
			String UserInput = input.nextLine();
			if(UserInput.equals(MKButton)){
				
				File PubFile = new File(FilePath);
				Scanner sf = new Scanner(PubFile);
				String PK = sf.nextLine();
				sf.close();
				
				System.out.println("Your public key is:");
				System.out.println(PK);
			}
			if(UserInput.equals(AKButton)){
				@SuppressWarnings("unused")
				String activator = AddKey.Activate();//Replaces the commented out code

				/*PrintWriter output = new PrintWriter(new FileWriter(AllKeyFile, true));
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
				}*/
			}
			if(UserInput.equals(VKButton)){
				Scanner FileGuts1 = new Scanner(AllKeyFile);
				for(;;){
					String Line = FileGuts1.nextLine();
					System.out.println(Line);
					
					boolean HasLine = FileGuts1.hasNextLine();
					if(HasLine == false){
						FileGuts1.close();
						System.out.println();
						break;
					}
				}
			}
			if(UserInput.equalsIgnoreCase(CButton)){
				System.out.println();
				FileGuts.close();
				FileGuts2.close();
				String Activator = "";
				return Activator;
 			}
			if(UserInput.equals(WIPEKEY) && AllKeyFile.exists()){
				System.out.println("Are you sure that you would like to clear all of the keys? This process is irreversible. " + Yes + "/" + No);
				String Surity = input.nextLine();
				if(Surity.equalsIgnoreCase(Yes)){
					AllKeyFile.delete();
				}
				else{
					System.out.println("Your keys have not been cleared.");
				}
			}
			System.out.println();
		}
	}
}