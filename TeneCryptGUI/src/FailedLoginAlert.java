import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class FailedLoginAlert {
	private static double FailedLoginAlertXOffset = 0;
	private	static double FailedLoginAlertYOffset = 0;
	
	public static String Activate() throws FileNotFoundException {
		String fileName = "Temp\\FailedLogins.shde";
		
		int lineCount = 0;
		String ContentText = "";
		
		File file = new File(fileName);
		if(file.exists()) {
			String FP = "Temp\\FailedLogins.shde";
			Scanner FileGuts = new Scanner(new File(FP));
			while(FileGuts.hasNextLine()) {
				lineCount += 1;
				ContentText += FileGuts.nextLine() + "\n";
			}
			FileGuts.close();
			
			Alert FailedLoginAlert = new Alert(AlertType.WARNING);
			FailedLoginAlert.setTitle("Failed Login");
			FailedLoginAlert.setHeaderText(null);
			FailedLoginAlert.setContentText("Failed Logins: " + lineCount + "\n\nTimes:\n" + ContentText);// + time);
			
			Scene FailedLoginAlertScene = FailedLoginAlert.getDialogPane().getScene();
			Stage FailedLoginAlertStage = (Stage) FailedLoginAlert.getDialogPane().getScene().getWindow();
			ImageView FailedLoginIconImageView = new ImageView(FailedLoginAlert.class.getResource("incorrectPasswordIcon.png").toString());
			FailedLoginIconImageView.setFitHeight(90);
			FailedLoginIconImageView.setFitWidth(90);
			FailedLoginAlert.setGraphic(FailedLoginIconImageView);
			
			FailedLoginAlertScene.getStylesheets().add("style.css");
			FailedLoginAlertStage.initStyle(StageStyle.UNDECORATED);
			FailedLoginAlertScene.setOnMousePressed(new EventHandler<MouseEvent>() {
		        public void handle(MouseEvent event) {
		        	FailedLoginAlertXOffset = event.getSceneX();
		        	FailedLoginAlertYOffset = event.getSceneY();
		        }
		    });
			FailedLoginAlertScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
		        public void handle(MouseEvent event) {
		        	FailedLoginAlertStage.setX(event.getScreenX() - FailedLoginAlertXOffset);
		        	FailedLoginAlertStage.setY(event.getScreenY() - FailedLoginAlertYOffset);
		        }
		    });
			
			FailedLoginAlert.showAndWait();
			
			file.delete();
		}
		
		
		return "";
	}
}