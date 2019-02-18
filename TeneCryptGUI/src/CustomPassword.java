import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Optional;
import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CustomPassword extends Worker{
	private static double passwordXOffset = 0;
	private	static double passwordYOffset = 0;
	
	private static double decisionXOffset = 0;
	private	static double decisionYOffset = 0;
	
	private static double newPasswordXOffset = 0;
	private	static double newPasswordYOffset = 0;
	
	private static double confirmationXOffset = 0;
	private	static double confirmationYOffset = 0;
	
	public static String Activate() throws FileNotFoundException{		
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
		
		String Current = "";
		String newPassword = "";
		
		TextInputDialog enterPasswordDialog = new TextInputDialog("");
		enterPasswordDialog.setHeaderText(null);
		enterPasswordDialog.setContentText("Please enter your current password:");
		Scene enterPasswordDialogScene = enterPasswordDialog.getDialogPane().getScene();
		Stage enterPasswordDialogStage = (Stage) enterPasswordDialog.getDialogPane().getScene().getWindow();
		//enterPasswordDialog.getIcons().add(new Image(test.class.getResourceAsStream("icon.png")));
		//enterPasswordDialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));
		enterPasswordDialogScene.getStylesheets().add("style.css");
		enterPasswordDialogStage.initStyle(StageStyle.UNDECORATED);
		enterPasswordDialogScene.setOnMousePressed(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	passwordXOffset = event.getSceneX();
	        	passwordYOffset = event.getSceneY();
	        }
	    });
		enterPasswordDialogScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	enterPasswordDialogStage.setX(event.getScreenX() - passwordXOffset);
	        	enterPasswordDialogStage.setY(event.getScreenY() - passwordYOffset);
	        }
	    });
		
		for(int triesLeft = 2;; triesLeft--) {
			Optional<String> result = enterPasswordDialog.showAndWait();
			if(result.isPresent()){
				Current = result.get();
				//Current = hasher.Activate(Current);//Hash Current here before comparing it to the hashed one
				if(Current.equals(PastPass)){
					break;
				}
				if(triesLeft == 0){
					enterPasswordDialog.close();
					FileGuts.close();
					sf1.close();
					return null;
				}
				enterPasswordDialog.setContentText("Please enter your current password:" + "\n You have " + triesLeft + " tries left.");
			}
			else{
				enterPasswordDialog.close();
				sf1.close();
				FileGuts.close();
				return null;
			}
		}

		String decisionAlertMessage = "How would you like your new password chosen?";
		ButtonType customPasswordButton = new ButtonType("Custom");
		ButtonType randomPasswordButton = new ButtonType("Random");
		
        Alert decision = new Alert(AlertType.NONE, decisionAlertMessage, customPasswordButton, randomPasswordButton);
		
		Scene decisionScene = decision.getDialogPane().getScene();
		Stage decisionStage = (Stage) decision.getDialogPane().getScene().getWindow();
		//decisionStage.getIcons().add(new Image(test.class.getResourceAsStream("icon.png")));
		decisionScene.getStylesheets().add("style.css");
		decisionStage.initStyle(StageStyle.UNDECORATED);
		decisionScene.setOnMousePressed(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	decisionXOffset = event.getSceneX();
	        	decisionYOffset = event.getSceneY();
	        }
	    });
		decisionScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	decisionStage.setX(event.getScreenX() - decisionXOffset);
	        	decisionStage.setY(event.getScreenY() - decisionYOffset);
	        }
	    });
		
		String passwordConfirmationAlertMessage = "Test message";
		ButtonType yesButton = new ButtonType("Yes");
		ButtonType noButton = new ButtonType("No");
		
		Alert passwordConfirmationAlert = new Alert(null);
		Scene passwordConfirmationScene = passwordConfirmationAlert.getDialogPane().getScene();
		Stage passwordConfirmationStage = (Stage) passwordConfirmationAlert.getDialogPane().getScene().getWindow();
		//passwordConfirmationStage.getIcons().add(new Image(test.class.getResourceAsStream("icon.png")));
		passwordConfirmationScene.setOnMousePressed(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	confirmationXOffset = event.getSceneX();
	        	confirmationYOffset = event.getSceneY();
	        }
	    });
		passwordConfirmationScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	decisionStage.setX(event.getScreenX() - confirmationXOffset);
	        	decisionStage.setY(event.getScreenY() - confirmationYOffset);
	        }
	    });
		
		Optional<ButtonType> option = decision.showAndWait();
		try{
			if(option.get() == customPasswordButton){
				for(;;){
					TextInputDialog newPasswordDialog = new TextInputDialog("");
					newPasswordDialog.setHeaderText(null);
					newPasswordDialog.setContentText("Please enter your new password:");
					Scene newPasswordDialogScene = newPasswordDialog.getDialogPane().getScene();
					Stage newPasswordDialogStage = (Stage) newPasswordDialog.getDialogPane().getScene().getWindow();
					//newPasswordDialogStage.getIcons().add(new Image(test.class.getResourceAsStream("icon.png")));
					//enterNewPasswordDialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));
					newPasswordDialogScene.getStylesheets().add("style.css");
					newPasswordDialogStage.initStyle(StageStyle.UNDECORATED);
					newPasswordDialogScene.setOnMousePressed(new EventHandler<MouseEvent>() {
				        public void handle(MouseEvent event) {
				        	newPasswordXOffset = event.getSceneX();
				        	newPasswordYOffset = event.getSceneY();
				        }
				    });
					newPasswordDialogScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
				        public void handle(MouseEvent event) {
				        	newPasswordDialogStage.setX(event.getScreenX() - newPasswordXOffset);
				        	newPasswordDialogStage.setY(event.getScreenY() - newPasswordYOffset);
				        }
				    });
					
					Optional<String> result = newPasswordDialog.showAndWait();
					if (result.isPresent()){
					    newPassword = result.get();
					    passwordConfirmationAlertMessage = "Your new password will be:\n\"" + newPassword + "\"\n\nDo you want to keep it?";
						passwordConfirmationAlert = new Alert(AlertType.NONE, passwordConfirmationAlertMessage, yesButton, noButton);
						passwordConfirmationScene = passwordConfirmationAlert.getDialogPane().getScene();
						passwordConfirmationStage = (Stage) passwordConfirmationAlert.getDialogPane().getScene().getWindow();
						passwordConfirmationScene.getStylesheets().add("style.css");
						passwordConfirmationStage.initStyle(StageStyle.UNDECORATED);
						Optional<ButtonType> passwordConfirmationOption = passwordConfirmationAlert.showAndWait();
						if(passwordConfirmationOption.get() == yesButton){
							File PassFile = new File(PassFilePath);
							FileWriter fw = new FileWriter(PassFile);
							PrintWriter output = new PrintWriter(fw);
							//newPassword = hasher.Activate(newPassword);
							output.print(newPassword);
							output.close();
							break;
						}
						else{
							//Do nothing
						}
					}
					else{
						
					}
				}
				sf1.close();
				FileGuts.close();
				return newPassword;
			}
			if(option.get() == randomPasswordButton){
				for(;;){
					newPassword = PasswordCreatorChanger.Activate();
					passwordConfirmationAlertMessage = "Your new password will be:\n\"" + newPassword + "\"\n\nDo you want to keep it?";
					passwordConfirmationAlert = new Alert(AlertType.NONE, passwordConfirmationAlertMessage, yesButton, noButton);
					passwordConfirmationScene = passwordConfirmationAlert.getDialogPane().getScene();
					passwordConfirmationStage = (Stage) passwordConfirmationAlert.getDialogPane().getScene().getWindow();
					passwordConfirmationScene.getStylesheets().add("style.css");
					passwordConfirmationStage.initStyle(StageStyle.UNDECORATED);
					Optional<ButtonType> passwordConfirmationOption = passwordConfirmationAlert.showAndWait();
					if(passwordConfirmationOption.get() == yesButton){						
						File PassFile = new File(PassFilePath);
						FileWriter fw = new FileWriter(PassFile);
						PrintWriter output = new PrintWriter(fw);
						
						//String hashedNewPassword = hasher.Activate(newPassword);
						output.print(newPassword);//output.print(hashedNewPassword);
						output.close();
						break;
					}
					else{
						//Do nothing
					}
					sf1.close();
					FileGuts.close();
					return newPassword;
				}
			}
		}
		catch(Exception e){
			System.exit(0);
		}
		sf1.close();
		return newPassword;
	}
}