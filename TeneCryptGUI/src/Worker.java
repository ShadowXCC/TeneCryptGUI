import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;

@SuppressWarnings("unused")
public class Worker extends Application{
	
	static Stage window = new Stage();
	String activator;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window.setOnCloseRequest(e -> Closer.Activate());
		
		//activator = Setup.Activate();//Commented while working on everything else, CDKeyCheck/PasswordCreator needs to be transformed into a GUI class
		
		activator = PasswordChecker.Activate();
		
		//System.out.println("For encryption or decryption press \"" + ED + "\". If you are here to manage keys, press \"" + KM + "\". Press \"" + CP + " \" to change your password. Press " + ExitKey + " to exit.");
		
		//activator = Base.Activate();
		
		//activator = AllKey.Activate();
		
		//activator = CustomPassword.Activate();
		
		//System.out.println("\nProgram Terminated.");
		//System.exit(0);
	}
}