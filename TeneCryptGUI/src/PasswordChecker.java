import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

public class PasswordChecker extends Worker{	

	static String activator;

	public static String Activate(){
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = null;
		try {
			FileGuts = new Scanner(FF);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String PassFilePath = null;
		int WantedLineCount = 3;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
		PassFilePath = "Data\\"+ PassFilePath;
		Scanner sf1 = null;
		try {
			sf1 = new Scanner(new File(PassFilePath));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String Pass = sf1.nextLine();
		
		window.setTitle("Password Screen");
		
		String message = "Insert your password here";
		Label label = new Label(message);
		PasswordField passwordField = new PasswordField();
		passwordField.setMaxWidth(208);
		passwordField.setAlignment(Pos.CENTER);
		Button loginButton = new Button("Login");
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, passwordField, loginButton);
		layout.setAlignment(Pos.CENTER);
		Scene passwordScene = new Scene(layout, 1040, 585);
		loginButton.setOnAction(e -> {
			String InputPass = null;
			for(int PasswordTriesLeft = 3;PasswordTriesLeft > -1;PasswordTriesLeft--){
				InputPass = passwordField.getText();
				if(InputPass.equals(Pass)){
					break;
				}
				if(InputPass.equals("")){
					//Do nothing?
					//Reprompt for password
				}
				if(PasswordTriesLeft < 3 && PasswordTriesLeft != 0){
					activator = WrongPassword.Activate(PasswordTriesLeft);
					label.setText(message + " " + PasswordTriesLeft + "/3");
				}
				if(PasswordTriesLeft == 0){
					activator = TooManyWrongPasswords.Activate(PasswordTriesLeft);
					System.exit(0);
				}
			}
			if(InputPass.equals(Pass)){
				Temp.Activate();
			}
			else{
				System.exit(0);
			}
			System.out.println();
		});
		
		window.setScene(passwordScene);
		window.show();
		
		String Activator = "";
		return Activator;
	}
}