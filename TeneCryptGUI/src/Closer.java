import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Closer{
	public static EventHandler<WindowEvent> Activate() {
		System.out.println("Proper");
				
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Wrong Password");
		window.setMinWidth(250);
		
		Label label = new Label();
		label.setText("Are you sure you want to exit?");
		
		Button yesButton = new Button("Yes");
		yesButton.setOnAction(e -> window.close());
		Button noButton = new Button("No");
		noButton.setOnAction(e -> window.close());//This shouldn't do anything
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();//Waits until the window is closed to return powers
		
		EventHandler<WindowEvent> Activator = null;
		return Activator;
	}
}