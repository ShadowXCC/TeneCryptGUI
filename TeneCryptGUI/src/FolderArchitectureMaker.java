import java.io.File;
import java.io.IOException;

public class FolderArchitectureMaker {
	FolderArchitectureMaker(){	}
	static public String Activate() throws IOException{
		String Directory1 = "Data";
		String Directory2 = "Temp";
		
		new File(Directory1).mkdirs();
		new File(Directory2).mkdirs();
		
		String Activator = "";
		return Activator;
	}
}