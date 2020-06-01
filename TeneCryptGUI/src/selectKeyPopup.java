import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class selectKeyPopup {	
	static String selection = "";

	public static String Activate() throws FileNotFoundException{
		String keys = returnKeys.Activate();
		
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 351, 624);
		scene.getStylesheets().add("style.css");
		window.getIcons().add(new Image(selectKeyPopup.class.getResourceAsStream("lockedIcon.png")));
		window.setTitle("Select Key");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		Label buttonSpacer = new Label("       ");
		
		Label keysLabel = new Label("Keys:");
		Label selectionLabel = new Label("Name:");
		TextArea keyTextArea = new TextArea(keys);
		keyTextArea.setMaxWidth(263.25);
		keyTextArea.setMinHeight(375);
		TextArea selectionTextArea = new TextArea("");
		selectionTextArea.setMaxSize(263.25, 50);
		
		HBox buttons = new HBox();
		buttons.setAlignment(Pos.CENTER);
				
		Button submitButton = new Button("Select");
		submitButton.setOnAction(e1 -> {
			selection = selectionTextArea.getText() + " - ";

			if((keys.contains(selection)) && !(selectionTextArea.getText().trim().isEmpty())) {
				System.out.println("Key Found");
				window.close();
			}
			else {
				selectionTextArea.clear();
				invalidKeyPopup.Activate();
			}
		});
		selectionTextArea.setOnKeyPressed(e1 -> {
			if (e1.getCode() == KeyCode.ENTER) {
		        e1.consume();
		        selection = selectionTextArea.getText() + " - ";

				if((keys.contains(selection)) && !(selectionTextArea.getText().trim().isEmpty())) {
					window.close();
				}
				else {
					selectionTextArea.clear();
					invalidKeyPopup.Activate();
				}
		    }
		});
		
		Button cancelButton = new Button("Cancel");
		cancelButton.setOnAction(e1 -> {
			window.close();
		});
		
		buttons.getChildren().addAll(submitButton, buttonSpacer, cancelButton);
		
		Main.getChildren().addAll(keysLabel, keyTextArea, spacer, selectionLabel, selectionTextArea, spacer2, buttons, spacer3);
		window.setScene(scene);
		window.showAndWait();
		
		if(selection.equals("")) {
			return selection;
		}
		else {
			return selection.substring(0,selection.length()-3);
		}
	}
}