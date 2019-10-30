import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class editKeyPopUp {
	public static String Activate() {
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 624, 351);
		scene.getStylesheets().add("style.css");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		Label spacer4 = new Label();
		Label spacer5 = new Label();
		
		HBox lineNumberStuff = new HBox();
		
		Label lineNumberLabel = new Label("Line Number:   ");
		TextArea lineNumberTextArea = new TextArea();
		lineNumberTextArea.setMaxWidth(561.6);
		
		lineNumberStuff.setAlignment(Pos.CENTER);
		lineNumberStuff.getChildren().addAll(lineNumberLabel, lineNumberTextArea);
		
		HBox newNameStuff = new HBox();
		
		Label newNameLabel = new Label("Name:   ");
		TextArea newNameTextArea = new TextArea();
		newNameTextArea.setMaxWidth(561.6);
		
		newNameStuff.setAlignment(Pos.CENTER);
		newNameStuff.getChildren().addAll(newNameLabel, newNameTextArea);
		
		HBox newKeyStuff = new HBox();
		
		Label newKeyLabel = new Label("Key:   ");
		TextArea newKeyTextArea = new TextArea();
		newKeyTextArea.setMaxWidth(561.6);
		
		newKeyStuff.setAlignment(Pos.CENTER);
		newKeyStuff.getChildren().addAll(newKeyLabel, newKeyTextArea);
		
		HBox buttons = new HBox();
		buttons.setAlignment(Pos.CENTER);
		
		Button submitButton = new Button("Submit");
		submitButton.setOnAction(e1 -> {
			try {
				editKey.Activate(Integer.parseInt(lineNumberTextArea.getText()), newNameTextArea.getText(), newKeyTextArea.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
			window.close();
		});
		
		Button cancelButton = new Button("Cancel");
		cancelButton.setOnAction(e1 -> {
			window.close();
		});
		
		Label buttonSpacer = new Label("   ");
		
		buttons.getChildren().addAll(submitButton, buttonSpacer, cancelButton);
		
		Main.getChildren().addAll(spacer, lineNumberStuff, spacer2, newNameStuff, spacer3, newKeyStuff, spacer4, buttons, spacer5);
		window.setScene(scene);
		window.show();
		
		String toReturn = "";
		return toReturn;
	}
}