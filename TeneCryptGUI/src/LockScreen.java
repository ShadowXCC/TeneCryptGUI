import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class LockScreen extends Worker{	
	BorderPane borderPane = new BorderPane();

	public static Scene Activate() throws FileNotFoundException{
		window.setTitle("TeneCrypt - Login");
		
		HBox topMenu = new HBox();		
        final ImageView selectedImage = new ImageView();   
		Image imageLogo = new Image(LockScreen.class.getResourceAsStream("Logo_1_260x94.png"));
        selectedImage.setImage(imageLogo);
        topMenu.getChildren().addAll(selectedImage);
        topMenu.setAlignment(Pos.TOP_LEFT);
		
		VBox centerMenu = new VBox();
		
		Region one = new Region();
		VBox.setVgrow(one, Priority.ALWAYS);
		
		String message = "Enter Your Password:";
		Label describer = new Label(message);
		PasswordField passwordField = new PasswordField();
		passwordField.setOnKeyPressed(event -> {
			if(event.getCode() == KeyCode.ENTER){
				String getPassword = passwordField.getText();
				passwordField.setText("");
				try {
					Boolean authenticate = PasswordChecker.Activate(getPassword);
					if(authenticate == true) {
						//Scene scene = MainPart.Activate();
						scene.getStylesheets().add("style.css");
						window.setScene(scene);
					}
					else {
						describer.setText("Incorrect Password, " + message);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}); 
		passwordField.setMaxWidth(208);
		passwordField.setAlignment(Pos.CENTER);
		
		Region two = new Region();
		VBox.setVgrow(two, Priority.ALWAYS);
		
		Button sendPass = new Button("Login");
		sendPass.setOnAction(event -> {
			String getPassword = passwordField.getText();
			passwordField.setText("");
			try {
				Boolean authenticate = PasswordChecker.Activate(getPassword);
				if(authenticate == true) {
					//Scene scene = MainPart.Activate();
					scene.getStylesheets().add("style.css");
					window.setScene(scene);
				}
				else {
					describer.setText("Incorrect Password," + message);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		});
		
		Region three = new Region();
		VBox.setVgrow(three, Priority.ALWAYS);
		
		centerMenu.getChildren().addAll(one, describer, passwordField, two, sendPass, three);
		centerMenu.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setCenter(centerMenu);
		Scene scene = new Scene(borderPane, 1040, 585);

		return scene;
	}

	public Pane getBorderPane() {
		return borderPane;
	}
}