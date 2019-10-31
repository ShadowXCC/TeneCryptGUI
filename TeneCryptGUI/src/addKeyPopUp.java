import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class addKeyPopUp {
	public static String Activate(){
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 624, 351);
		scene.getStylesheets().add("style.css");
		window.getIcons().add(new Image(addKeyPopUp.class.getResourceAsStream("lockedIcon.png")));
		window.setTitle("Add New Key");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		Label spacer4 = new Label();
		
		HBox nameStuff = new HBox();
		
		Label nameLabel = new Label("Name:   ");
		TextArea nameTextArea = new TextArea();
		nameTextArea.setMaxWidth(561.6);
		nameTextArea.setMaxHeight(75);
		
		nameStuff.setAlignment(Pos.CENTER);
		nameStuff.getChildren().addAll(nameLabel, nameTextArea);
		
		HBox keyStuff = new HBox();
		
		Label keyLabel = new Label("Key:   ");
		TextArea keyTextArea = new TextArea();
		keyTextArea.setMaxWidth(561.6);
		
		keyStuff.setAlignment(Pos.CENTER);
		keyStuff.getChildren().addAll(keyLabel, keyTextArea);
		
		HBox buttons = new HBox();
		buttons.setAlignment(Pos.CENTER);
		
		Button submitButton = new Button("Submit");
		submitButton.setOnAction(e1 -> {
			try {
				addKey.Activate(nameTextArea.getText(), keyTextArea.getText());
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
		
		Main.getChildren().addAll(spacer, nameStuff, spacer2, keyStuff, spacer3, buttons, spacer4);
		window.setScene(scene);
		window.show();
		
		String toReturn = "";
		return toReturn;
	}
}