import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Temp extends Worker{	
	public static String Activate() {
		//Stage window = new Stage();
		window.setTitle("Success Screen");
		
		Label label = new Label("AYYY IT WORKED");
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label);
		layout.setAlignment(Pos.CENTER);
		Scene successScene = new Scene(layout, 1040, 585);
		window.setScene(successScene);
		
		window.setScene(successScene);
		window.show();
		
		String Activator = "";
		return Activator;
	}
}