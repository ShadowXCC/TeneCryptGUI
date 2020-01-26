import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class confirmationScreen {
	static boolean toReturn = false; //Default false in case of premature window close
	
	public static Boolean Activate(String message){		
		Stage window = new Stage();
		window.getIcons().add(new Image(confirmationScreen.class.getResourceAsStream("lockedIcon.png")));
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 312, 175.5);
		scene.getStylesheets().add("style.css");
		window.setTitle("Confirm");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		Label buttonSpacer = new Label("       ");
		
		String spaces = "";
		for(int a = 0; a + message.substring(36).length() / 2 < 36 / 2; a++) {
			spaces += "  ";
		}
		message = message.substring(0, 36) + "\n" + spaces + message.substring(36);
		
		Label messageLabel = new Label(message);
				
		HBox buttons = new HBox();
		buttons.setAlignment(Pos.CENTER);
				
		Button submitButton = new Button("Yes");
		submitButton.setOnAction(e1 -> {
			toReturn = true;
			
			window.close();
		});
		
		Button cancelButton = new Button("No");
		cancelButton.setOnAction(e1 -> {
			toReturn = false;
			
			window.close();
		});
		
		buttons.getChildren().addAll(submitButton, buttonSpacer, cancelButton);
		
		Main.getChildren().addAll(spacer, messageLabel, spacer2, buttons, spacer3);
		window.setScene(scene);
		window.showAndWait();
		
		return toReturn;
	}
}