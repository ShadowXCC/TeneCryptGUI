import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class InitialSetup extends Worker{
	private static double xOffset = 0;
	private	static double yOffset = 0;
	public static Scene Activate() throws IOException{
		Clipboard clipboard = Clipboard.getSystemClipboard();
		final ClipboardContent content = new ClipboardContent();
		
		window.setTitle("TeneCrypt - Setup");
		
		Region left = new Region();
		HBox.setHgrow(left, Priority.ALWAYS);
		Region right = new Region();
		HBox.setHgrow(right, Priority.ALWAYS);
		
		HBox topMenu = new HBox();		
		final ImageView selectedImage = new ImageView();   
		Image imageLogo = new Image(InitialSetup.class.getResourceAsStream("Logo.png"));
        selectedImage.setImage(imageLogo);
        topMenu.getChildren().addAll(left, selectedImage, right);
        topMenu.setAlignment(Pos.TOP_LEFT);

		VBox centerMenu = new VBox();
		Label describer = new Label();
		Label spacer = new Label();
		Label spacer2 = new Label();
		TextArea TextBox = new TextArea();//Place to input CDKey, definitely needs work
		TextBox.getStyleClass().add("Setup");
		TextBox.setMaxWidth(416);
		TextBox.setMaxHeight(87.75);
		Button Stepper = new Button("Next");
		Button copyTextAreaButton = new Button("Copy");
		copyTextAreaButton.setOnAction(e1 -> {
			content.putString(TextBox.getText());
			clipboard.setContent(content);
		});
		
		TextBox.setOnMouseClicked(e1 -> {
			TextBox.selectAll();
		});
		//Folder Architecture Maker
		FolderArchitectureMaker.Activate();
		
		//Config Maker
		ConfigMaker.Activate();
		
		//CD Key Check
		describer.setText("Please enter your CD Key:");
		TextBox.setOnKeyPressed(event -> {
			if(event.getCode() == KeyCode.ENTER){
				//String CDKey = TextBox.getText();
			}
		});
		Stepper.setOnAction(event -> {
			//String CDKey = TextBox.getText();
		});
		
		//boolean check = CDKeyCheck.Activate(CDKey);
		boolean check = true;
		if(check == true){
			//Password
			describer.setText("Your Password is:");
			String password = PasswordCreator.Activate();//Returns the default password from PasswordCreator
			TextBox.setEditable(false);
			TextBox.setText(password);
			TextBox.getStyleClass().add("initialSetupTextBox");
			
			HBox buttons = new HBox();
			buttons.setAlignment(Pos.CENTER);
			
			buttons.getChildren().addAll(Stepper, copyTextAreaButton);
			
			centerMenu.getChildren().addAll(describer, spacer, TextBox, spacer2, buttons);
			Stepper.setOnAction(event -> {
				buttons.getChildren().remove(copyTextAreaButton);
				
				//Display Public Key
				describer.setText("Your Public Key is:");
				String ppKey = null;
				try {
					ppKey = PPKeyCreator.Activate(); //Gets key
					ppKey = formatKey.Activate(ppKey); // Formats key
				} catch (IOException e) {
					e.printStackTrace();
				}
				TextBox.setWrapText(true);
				TextBox.setMaxHeight(175.5);
				TextBox.setMaxWidth(350);
				TextBox.setEditable(false);
				TextBox.setText(ppKey);
				Stepper.setOnAction(event1 -> {
					try {
						Scene scene = LockScreen.Activate();
						scene.getStylesheets().add("style.css");
						window.setScene(scene);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
				});
			});
		}
		else{
			describer.setText("Incorrect CDKey, please enter your CD Key:");
			TextBox.setText("");
		}
		
		centerMenu.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setCenter(centerMenu);
		Scene scene = new Scene(borderPane, 1040, 585);
		
		borderPane.setOnMousePressed(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	            xOffset = event.getSceneX();
	            yOffset = event.getSceneY();
	        }
	    });

		borderPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	            window.setX(event.getScreenX() - xOffset);
	            window.setY(event.getScreenY() - yOffset);
	        }
	    });
		
		return scene;
	}
}