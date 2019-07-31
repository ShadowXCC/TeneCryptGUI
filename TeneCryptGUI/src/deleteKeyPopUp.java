import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class deleteKeyPopUp {
	public static String Activate() {
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 624, 351);
		scene.getStylesheets().add("style.css");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		
		HBox lineNumberStuff = new HBox();
		
		Label lineNumberLabel = new Label("Line Number: ");
		TextArea lineNumberTextArea = new TextArea();
		lineNumberTextArea.setMaxWidth(561.6);
		
		lineNumberStuff.setAlignment(Pos.CENTER);
		lineNumberStuff.getChildren().addAll(lineNumberLabel, lineNumberTextArea);
		
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
		
		buttons.getChildren().addAll(deleteButton, cancelButton);
		
		Main.getChildren().addAll(spacer, lineNumberStuff, spacer2, buttons, spacer3);
		window.setScene(scene);
		window.show();
		
		
		String toReturn = "";
		return toReturn;
	}
}