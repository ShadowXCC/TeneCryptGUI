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

public class deleteKeyPopUp {
	public static String Activate() {
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 624, 175.5); //624, 351
		scene.getStylesheets().add("style.css");
		window.getIcons().add(new Image(deleteKeyPopUp.class.getResourceAsStream("lockedIcon.png")));
		window.setTitle("Delete Existing Key");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		Label spacer4 = new Label(" ");
		
		HBox lineNumberStuff = new HBox();
		
		Label lineNumberLabel = new Label("Line Number: ");
		TextArea lineNumberTextArea = new TextArea();
		//lineNumberTextArea.setMaxWidth(561.6);
		lineNumberTextArea.setMaxWidth(400);
		lineNumberTextArea.setMaxHeight(75);
		
		lineNumberStuff.setAlignment(Pos.CENTER);
		lineNumberStuff.getChildren().addAll(lineNumberLabel, spacer4, lineNumberTextArea);
		
		HBox buttons = new HBox();
		buttons.setAlignment(Pos.CENTER);
		
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e1 -> {
			try {
				deleteKey.Activate(Integer.parseInt(lineNumberTextArea.getText()));
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
		
		buttons.getChildren().addAll(deleteButton, buttonSpacer, cancelButton);
		
		Main.getChildren().addAll(spacer, lineNumberStuff, spacer2, buttons, spacer3);
		window.setScene(scene);
		window.show();
		
		String toReturn = "";
		return toReturn;
	}
}