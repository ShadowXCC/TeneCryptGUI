import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class noKeyFilePopup {
	public static String Activate(){
		Stage window = new Stage();
		VBox Main = new VBox();
		Main.setAlignment(Pos.CENTER);
		Scene scene = new Scene(Main, 624, 351);
		scene.getStylesheets().add("style.css");
		window.getIcons().add(new Image(addKeyPopUp.class.getResourceAsStream("lockedIcon.png")));
		window.setTitle("No Keys Found");
		
		Label spacer = new Label();
		Label spacer2 = new Label();
		Label spacer3 = new Label();
		
		Label question = new Label("You have no stored keys, would you like to add one now?");
		
		HBox buttons = new HBox();
		buttons.setAlignment(Pos.CENTER);
		
		Button yesButton = new Button("Yes");
		yesButton.setOnAction(e1 -> {
			addKeyPopUp.Activate();
			window.close();
		});
		
		Button noButton = new Button("No");
		noButton.setOnAction(e1 -> {
			window.close();
		});
		
		Label buttonSpacer = new Label("   ");
		
		buttons.getChildren().addAll(yesButton, buttonSpacer, noButton);
		
		Main.getChildren().addAll(spacer, question, spacer2, buttons, spacer3);
		window.setScene(scene);
		window.show();
		
		String toReturn = "";
		return toReturn;
	}
}