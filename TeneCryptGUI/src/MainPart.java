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

public class MainPart extends Worker{
	private static double xOffset = 0;
	private	static double yOffset = 0;
	
	public static Scene Activate() throws FileNotFoundException{
		Clipboard clipboard = Clipboard.getSystemClipboard();
		final ClipboardContent content = new ClipboardContent();
		
		FailedLoginAlert.Activate();
		window.setTitle("Title");
		
		VBox centerMenu = new VBox();
		Label a = new Label("Please select a menu option");
		Label b = new Label();
		TextArea TextBox = new TextArea();
		TextBox.setWrapText(true);
		TextArea OutputTextBox =  new TextArea();
		OutputTextBox.setWrapText(true);
		OutputTextBox.setEditable(false);
		Button doWork = new Button("Submit");
		Button buttonOne = new Button();
		Button buttonTwo = new Button();
		Button buttonThree = new Button();
		Region r = new Region();
		VBox.setVgrow(r, Priority.ALWAYS);
		Region r2 = new Region();
		VBox.setVgrow(r2, Priority.ALWAYS);
		Region r3 = new Region();
		VBox.setVgrow(r3, Priority.ALWAYS);
		centerMenu.getChildren().addAll(a);
		centerMenu.setAlignment(Pos.CENTER);
		
		VBox leftMenu = new VBox();
		ImageView logoImageView = new ImageView();   
		Image imageLogo = new Image(MainPart.class.getResourceAsStream("Logo.png"));
		logoImageView.setImage(imageLogo);
		
		ImageView EncryptImageView = new ImageView();
		Image encryptImage = new Image(MainPart.class.getResourceAsStream("lockedIcon.png"));
		EncryptImageView.setImage(encryptImage);
		EncryptImageView.setFitHeight(30);
		EncryptImageView.setFitWidth(30);
		Button button1 = new Button("Encrypt", EncryptImageView);
		button1.setMinSize(260, 81.9);
		button1.setOnAction(e -> {
			centerMenu.getChildren().clear();
			TextBox.setText("");
			OutputTextBox.setText("");
			
			a.setText("Enter String to Ecrypt:");
			TextBox.setMinWidth(676);
			TextBox.setMaxWidth(676);
			TextBox.setMinHeight(200);
			TextBox.setMaxHeight(200);
			b.setText("Encrypted String:");
			OutputTextBox.setMinWidth(676);
			OutputTextBox.setMaxWidth(676);
			OutputTextBox.setMinHeight(200);
			OutputTextBox.setMaxHeight(200);
			
			doWork.setOnAction(e1 -> {
				String toEncrypt = TextBox.getText();
				try {
					OutputTextBox.setText(encryptLogic.Activate(toEncrypt));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			});
			TextBox.setOnKeyPressed(e1 -> {
				if (e1.getCode() == KeyCode.ENTER) {
			        e1.consume(); //otherwise a new line will be added to the textArea after the sendFunction() call
			        String toEncrypt = TextBox.getText();
					try {
						OutputTextBox.setText(encryptLogic.Activate(toEncrypt));
					} catch (IOException e2) {
						e2.printStackTrace();
					}
			    }
			});
			OutputTextBox.setOnMouseClicked(e1 -> {
				OutputTextBox.selectAll();
			});
			
			Button copyTextAreaButton = new Button("Copy");
			copyTextAreaButton.setOnAction(e1 -> {
				content.putString(OutputTextBox.getText());
				clipboard.setContent(content);
			});
			
			HBox encryptButtons = new HBox();
			encryptButtons.setAlignment(Pos.CENTER);
			
			encryptButtons.getChildren().addAll(doWork, copyTextAreaButton);
			
			centerMenu.getChildren().addAll(r, a, TextBox, encryptButtons, r2, b, OutputTextBox, r3);
		});
		
		ImageView DecryptImageView = new ImageView();
		Image DecryptImage = new Image(MainPart.class.getResourceAsStream("unlockedIcon.png"));
		DecryptImageView.setImage(DecryptImage);
		DecryptImageView.setFitHeight(30);
		DecryptImageView.setFitWidth(30);
		Button button2 = new Button("Decrypt", DecryptImageView);
		button2.setMinSize(260, 81.9);
		button2.setOnAction(e -> {
			centerMenu.getChildren().clear();
			TextBox.setText("");
			OutputTextBox.setText("");
			
			a.setText("Enter Encrypted String to Decrypt:");
			TextBox.setMinWidth(676);
			TextBox.setMaxWidth(676);
			TextBox.setMinHeight(200);
			TextBox.setMaxHeight(200);
			b.setText("Decrypted String:");
			OutputTextBox.setMinWidth(676);
			OutputTextBox.setMaxWidth(676);
			OutputTextBox.setMinHeight(200);
			OutputTextBox.setMaxHeight(200);
			
			doWork.setOnAction(e1 -> {
				String toDecrypt = TextBox.getText();
				try {
					OutputTextBox.setText(decryptLogic.Activate(toDecrypt));
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			});
			TextBox.setOnKeyPressed(e1 -> {
				if (e1.getCode() == KeyCode.ENTER) {
			        e1.consume(); //otherwise a new line will be added to the textArea after the sendFunction() call
			        String toDecrypt = TextBox.getText();
					try {
						OutputTextBox.setText(decryptLogic.Activate(toDecrypt));
					} catch (IOException e2) {
						e2.printStackTrace();
					}
			    }
			});
			OutputTextBox.setOnMouseClicked(e1 -> {
				OutputTextBox.selectAll();
			});
			
			Button copyTextAreaButton = new Button("Copy");
			copyTextAreaButton.setOnAction(e1 -> {
				content.putString(OutputTextBox.getText());
				clipboard.setContent(content);
			});
			
			HBox decryptButtons = new HBox();
			decryptButtons.setAlignment(Pos.CENTER);
			
			decryptButtons.getChildren().addAll(doWork, copyTextAreaButton);
			
			centerMenu.getChildren().addAll(r, a, TextBox, decryptButtons, r2, b, OutputTextBox, r3);
		});
		
		ImageView KeyManagementImageView = new ImageView();
		Image KeyManagementImage = new Image(MainPart.class.getResourceAsStream("keysIcon.png"));
		KeyManagementImageView.setImage(KeyManagementImage);
		KeyManagementImageView.setFitHeight(30);
		KeyManagementImageView.setFitWidth(30);
		Button button3 = new Button("Key Management", KeyManagementImageView);
		button3.setMinSize(260, 81.9);
		button3.setOnAction(e -> {
			centerMenu.getChildren().clear();
			TextBox.setText("");
			OutputTextBox.setText("");
			
			a.setText("Stored Keys");
			OutputTextBox.setMinWidth(676);
			OutputTextBox.setMaxWidth(676);
			OutputTextBox.setMinHeight(438.75);
			OutputTextBox.setMaxHeight(438.75);
			
			buttonOne.setText("Add");
			buttonTwo.setText("Edit");
			buttonThree.setText("Remove");
			buttonOne.setOnAction(e1 -> {
				//New window that prompts for name and key, then passes those to AddKey.Activate()
			});
			buttonTwo.setOnAction(e1 -> {
				//New window that prompts for key line number, then provides editable textboxes that already contain the name and key, then outputs whatever
				//is left in the textboxes to that line
				//This might not be directly possible or reasonable
			});
			buttonThree.setOnAction(e1 -> {
				//New window that prompts for key line number and then deletes it and removes the empty line
				//This might not be directly possible or reasonable
			});
			HBox keyManagementButtons = new HBox();
			keyManagementButtons.setAlignment(Pos.CENTER);
			keyManagementButtons.getChildren().addAll(buttonOne, buttonTwo, buttonThree);
			
			centerMenu.getChildren().addAll(r, a, OutputTextBox, r2, keyManagementButtons, r3);
		});
		
		ImageView OptionsImageView = new ImageView();
		Image OptionsImage = new Image(MainPart.class.getResourceAsStream("gearIcon.png"));
		OptionsImageView.setImage(OptionsImage);
		OptionsImageView.setFitHeight(30);
		OptionsImageView.setFitWidth(30);
		Button button4 = new Button("Options", OptionsImageView);
		button4.setMinSize(260, 81.9);
		button4.setOnAction(e -> {
			centerMenu.getChildren().clear();
			a.setText("Options");
			buttonOne.setText("Change Password");
			buttonOne.setOnAction(e1 -> {
				try{
					CustomPassword.Activate();
				} catch(FileNotFoundException e2){
					
				}
			});
			
			centerMenu.getChildren().addAll(a, buttonOne);
		});
		
		Button button5 = new Button("Lock");
		button5.setMinSize(260, 81.9);
		button5.setOnAction(e -> {
			try {
				TextBox.setText("");
				OutputTextBox.setText("");
				Scene scene = LockScreen.Activate();
				scene.getStylesheets().add("style.css");
				window.setScene(scene);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		});
		
		Button button6 = new Button("Exit");
		button6.setMinSize(260, 81.0);
		button6.setOnAction(e -> {
			window.close();
		});
		
		leftMenu.getChildren().addAll(logoImageView, button1, button2, button3, button4, button5, button6);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(centerMenu);
		borderPane.setLeft(leftMenu);
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