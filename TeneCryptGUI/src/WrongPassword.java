import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WrongPassword {
	public static String Activate(int trysLeft) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);//Blocks other user interaction with the program
		window.setTitle("Wrong Password");
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText("Incorrect Password, Try Again?");
		
		Button yesButton = new Button("Yes");
		yesButton.setOnAction(e -> window.close());
		Button noButton = new Button("No");
		noButton.setOnAction(e -> System.exit(0));
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();//Waits until the window is closed to return powers
		
		String Activator = "";
		return Activator;
	}
}