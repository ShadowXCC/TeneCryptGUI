import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CustomPassword {
	CustomPassword(){	}
	@SuppressWarnings("resource")
	public static String Activate() throws IOException{
		String Activator;
		Scanner input = new Scanner(System.in);
		
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		
		String PassFilePath = null;
		int WantedLineCount = 3;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
		PassFilePath = "Data\\" + PassFilePath;
		Scanner sf1 = new Scanner(new File(PassFilePath));
		String PastPass = sf1.nextLine();
		
		String Current = null;
		String DCP = "1";
		String CRP = "2";
		String EK = "X";
		
		for(;;){
			System.out.println();
			System.out.println("Please enter your current password to reset it, or press \"" + EK + "\" to return to the main menu.");
			Current = input.nextLine();
			if(Current.equals(PastPass)){
				for(;;){
					System.out.println("Press \"" + DCP + "\" if you want to define a custom password. Press \"" + CRP + "\" if you want a new randomized password.");
					String NP  = input.nextLine();
					if(NP.equals(DCP)){
						System.out.println("Please enter your new password:");
						String NewPassword = input.nextLine();
						File PassFile = new File(PassFilePath);
						FileWriter fw = new FileWriter(PassFile);
						PrintWriter output = new PrintWriter(fw);
						output.print(NewPassword);
						output.close();
						System.out.println("Your new password is: " + NewPassword);
						Activator = "";
						return Activator;
					}
					if(NP.equals(CRP)){
						@SuppressWarnings("unused")
						String activate = PasswordCreatorChanger.Activate();
					}
				}
			}
			if(Current.equalsIgnoreCase(EK)){
				sf1.close();
				FileGuts.close();
				Activator = "";
				System.out.println();
				return Activator;
			}
			if(!Current.equals(PastPass)){
				System.out.println("Incorrect Password.");
				sf1.close();
				FileGuts.close();
				Activator = "";
				System.out.println();
				return Activator;
			}
		}
	}
}
