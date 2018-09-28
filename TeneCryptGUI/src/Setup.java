import java.io.IOException;

public class Setup {
	Setup(){	}
	static public String Activate() throws IOException{
		@SuppressWarnings("unused")
		String activator;
		
		activator = ConfigMaker.Activate();
		activator = FolderArchitectureMaker.Activate();
		activator = CDKeyCheck.Activate();
		activator = PasswordCreator.Activate();
		activator = PPKeyCreator.Activate();
		
		String Activator = "";
		return Activator;
	}
}