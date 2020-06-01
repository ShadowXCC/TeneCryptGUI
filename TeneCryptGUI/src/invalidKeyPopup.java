import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class invalidKeyPopup {
	public static String Activate() {
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 312, 175.5);
		scene.getStylesheets().add("style.css");
		window.getIcons().add(new Image(invalidKeyPopup.class.getResourceAsStream("lockedIcon.png")));
		
		Label title = new Label("Unknown Key Specified.");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		
		Button retryButton = new Button("Retry");
		retryButton.setOnAction(e1 -> {
			window.close();
		});
		
		Button addNewKeyButton = new Button("Add New Key");
		addNewKeyButton.setOnAction(e1 -> {
			addKeyPopUp.Activate();
			window.close();
		});

		HBox buttons = new HBox();
		Label buttonSpacer = new Label("        ");
		buttons.setAlignment(Pos.CENTER);
		
		buttons.getChildren().addAll(retryButton, buttonSpacer, addNewKeyButton);
		
		Main.getChildren().addAll(spacer, title, spacer2, buttons, spacer3);
		
		window.setScene(scene);
		window.show();
		
		String toReturn = "";
		return toReturn;
	}
}