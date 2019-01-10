import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.*;

public class Worker extends Application{
		static Stage window = new Stage();
		String Activator;
		static Scene scene;
		
		public static void main(String[] args){
			launch(args);
		}

		public void start(Stage primaryStage) throws IOException{
			String FileName = "Data\\Config.shde";
			boolean DoesItExist = new File(FileName).isFile();
			
			if(DoesItExist == false) {
				scene = InitialSetup.Activate();
			}
			else {
				scene = LockScreen.Activate();
			}
			
			window.setScene(scene);
			
			//Global Effects
			scene.getStylesheets().add("style.css");
			window.setResizable(false);
			window.initStyle(StageStyle.UNDECORATED);
						
			window.show();
	}
}