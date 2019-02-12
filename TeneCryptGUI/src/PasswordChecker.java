import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PasswordChecker {
	private static double xOffset = 0;
	private	static double yOffset = 0;
	
	static int passwordTriesLeft = 3;	
	
	public static Boolean Activate(String InputPass) throws FileNotFoundException{
		InputPass = hasher.Activate(InputPass);
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
		
		ButtonType fullCloseButton = new ButtonType("Close");
		
		String alertMessage = (passwordTriesLeft - 1) + " Attempts Remaining.";
		if(passwordTriesLeft ==2) {
			alertMessage = (passwordTriesLeft - 1) + " Attempt Remaining";
		}
		if(passwordTriesLeft == 1) {
			alertMessage = "No Attempts Remaining, Closing Program.";
		}
		
        Alert passwordTriesLeftAlert = new Alert(AlertType.NONE, alertMessage, ButtonType.CLOSE);

		if(passwordTriesLeft == 1) {
			passwordTriesLeftAlert.getButtonTypes().clear();
			passwordTriesLeftAlert.getButtonTypes().addAll(fullCloseButton);
		}
		Scene passwordTriesLeftAlertScene = passwordTriesLeftAlert.getDialogPane().getScene();
		Stage passwordTriesLeftAlertStage = (Stage) passwordTriesLeftAlert.getDialogPane().getScene().getWindow();
		passwordTriesLeftAlertStage.getIcons().add(new Image(PasswordChecker.class.getResourceAsStream("incorrectPasswordIcon.png")));
		passwordTriesLeftAlertScene.getStylesheets().add("style.css");
		passwordTriesLeftAlertStage.initStyle(StageStyle.UNDECORATED);
		
		passwordTriesLeftAlertScene.setOnMousePressed(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	            xOffset = event.getSceneX();
	            yOffset = event.getSceneY();
	        }
	    });
		passwordTriesLeftAlertScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	passwordTriesLeftAlertStage.setX(event.getScreenX() - xOffset);
	        	passwordTriesLeftAlertStage.setY(event.getScreenY() - yOffset);
	        }
	    });

		if(InputPass.equals(Pass)){
			check = true;
		}else if(!InputPass.equals(Pass)){
			passwordTriesLeft--;
			if(passwordTriesLeft == 2) {
				passwordTriesLeftAlert.show();
			}
			if(passwordTriesLeft == 1) {
				passwordTriesLeftAlert.show();
			}
			if(passwordTriesLeft == 0) {
				Optional<ButtonType> option = passwordTriesLeftAlert.showAndWait();
				try{
					if(option.get() == fullCloseButton) {
						System.exit(0);
					}
				}
				catch(Exception e){
					System.exit(0);
				}
			}
		}
		sf1.close();
		FileGuts.close();
		return check;
	}
}