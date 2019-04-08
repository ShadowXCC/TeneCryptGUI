import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FailedLoginFileCreator {
	public static String Activate() throws IOException {
		String FileName = "Temp\\FailedLogins.shde";
		
		FileWriter fw = new FileWriter(FileName, true);
		PrintWriter output = new PrintWriter(fw);
		
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();
	    String DateTime = formatter.format(date);	    
        String[] splitString = DateTime.split(" ", 2);
        String Message = "Failed Login at " + splitString[1] + " on " + splitString[0];
        output.println(Message);
		
		output.close();
		fw.close(); 
		return "";
	}
}